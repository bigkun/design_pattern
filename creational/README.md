## 创建型设计模式
* Factory Method
* Abstract Factory
* Builder
* Prototype
* Singleton


### 工厂模式
工厂模式有： Factory Method 和 Abstract Factory 两种。

> 还有一种Simple Factory, 它并不属于Gof 23种设计模式，它一种特定的工厂方法模式。

简单工厂模式，提供一个静态工厂方法，根据传参，实例化对应的子类产品。优点实现简单，缺点：扩展需要改动工厂方法。
扩展其它产品时，不符合 **开闭原则**。

工厂方法和抽象工厂具体产品都有自己的工厂类实现。

如果场景，相对简单，可以使用Factory Method模式，如果相对复杂，扩展较多，使用Abstract Factory模式。

* Factory Method:
    * 由子类进行实例化
    * 一个具体工厂类，只能生产同一种产品(只有一个create方法)
    * 工厂和产品绑定唯一
    * 侧重垂直扩展
* Abstract Factory: 
    * 使用不同的工厂实例(同一父类)生产不同的产品(有多个create方法)
    * 重在零件拼装，组合出产品
    * 工厂和零件绑定，可以组合出多种产品
    * 侧重水平扩展
> 
> * [小谈抽象工厂模式与工厂方法，Abstract Factory Pattern and Factory Method](https://blog.csdn.net/gusgao/article/details/52177069)
> * [Factory Method vs Abstract Factory](https://blog.csdn.net/u010373266/article/details/53764737)

#### 总结
> 1. **简单工厂模式**实现比较简单,使用统一的工厂类和实例，根据不同参数实例化不同的具体类产品，扩展需要改动工厂类逻辑。
> 2. **工厂方法模式**和**抽象工厂模式** 都做到了开闭原则，对扩展可以不改动现有代码。
> 3. **抽象工厂模式** 最大的不同点在于生产一组产品，有多个create方法实例化多种子产品，最后将各种子产品组合成产品。

### 建造模式 Builder
一步步创建一个复杂的定制化对象。

建造者模式有4个概念：
1. 建造者(Builder): 定义生成实例和各个生产环节的接口
2. 具体的建造者(ConcreteBuilder): 实现Builder方法
3. 监工/项目经理/指挥者(Director): 负责使用Builder的接口来生成实例，并不依赖ConcreteBuilder。决定建造逻辑顺序。
4. 产品(Product): 最终被生成的实例

#### 简单建造者模式
经典Builder模式，使用起来比较复杂，简单建造者模式更容易实现。
* 这种模式下，产品类可以不提供public构造方法，通过Builder实例化
* 产品的Builder提供产品所有属性的set方法
* 调用Builder.build()方法时才实例化产品实例
* 链式调用，使用优雅，可读性好
```
Product.Builder builder = new Product.Builder();
Product product = builder.setName("产品1")
                .setWeight(100)
                .build();
product.use();
```
### 单例模式 Singleton
 *[Java实现单例模式的9种方法](https://blog.csdn.net/qq_35860138/article/details/86477538)*

单例模式依赖Java语言的两个特性一个是static, 一个是private 构造方法。 
* static 保证单例及对象的生命周期，在classloader生命周期内，单例对象不被GC
* private保证对象实例化受限制，对象不会被外部随意实例化(new)

单例模式面临2个挑战：**实例化时机**以及**并发**。

#### 饿汉模式
```
public class Singleton {
    private static Singleton singleton = new Singleton(); // static 保证了类肯定会被实例化，且只有一个，并且classloader生命周期内一直存活。
    private Singleton() {} // private 使得类实例化受限
    public static Singleton getInstance() { 
        return singleton;
    }
}
```
> 这种在类加载时就实例化的方式解决了并发问题，但是副作用就是，不管是否会被使用，都会在类加载的时候分配堆内存进行对象实例化。

#### 延迟加载/懒加载 lazy load (懒汉模式)
##### 1. 简单的延迟加载实现
```
public class Singleton {
    private static Singleton singleton = null; // 类加载时并不马上实例化对象
    private Singleton() {}
    public static Singleton getInstance() {
        if (singleton == null) { // 在每次获取实例时，判断对象是否为null，若null则进行实例化。
            singleton = new Singleton(); 
        }
        return singleton;
    }
}
```
> 上面这种方式做到了按需实例化，也就是延迟加载。但是，同时带来一个问题，就是并发场景下，静态field singleton 
在多个线程中同时检查是否为null时，都认为是null，然后导致同时new了多个Singleton。这样在并发的多个线程中，可能引用的实例并不是同一个对象。
##### 2. 解决并发的延迟加载
在上一例中，虽然实现了延迟加载，但也同时带来了并发问题。解决并发，最简单的方式**synchronized**.
```
public class Singleton {
    private static Singleton singleton = null; // 类加载时并不马上实例化对象
    private Singleton() {}
    public static synchronized Singleton getInstance() { // synchronized 处理并发
        if (singleton == null) { // 在每次获取实例时，判断对象是否为null，若null则进行实例化。
            singleton = new Singleton(); 
        }
        return singleton;
    }
}
```
> 这样就解决了延迟加载中的并发问题。但这也并非完美的方案，还是有副作用的，就是静态方法级的synchronized，在高并发场景
会导致性能下降。

> 另外除了使用synchronized也可以使用其他并发编程的方式解决竞争，例如：ReentrantLock、AtomicReference等。

##### 3. 优化synchronized
其实只要保证在new Singleton时互斥即可。
```
public class Singleton {
    private static Singleton singleton = null;
    // private static Object obj = new Object();
    private Singleton() {}
    public static Singleton getInstance() {
        if (singleton == null) { 
            synchronized (Singleton.class) { // 此处也可以 sychronized(obj) 一个静态对象
                singleton = new Singleton(); 
            }            
        }
        return singleton;
    }
}
```
> 这样就降低了锁竞争的发生概率，但是如果发生了竞争，线程1得到锁对singleton进行了实例化，而线程2处于等待，待线程1释放锁后，线程2并没有再次检查singleton的
状态，会继续为singleton实例化。这就导致了会有小概率singleton被多次实例化。所有需要在实例化之前再检查一遍singleton是否为null.
```
public class Singleton {
    private static Singleton singleton = null;
    // private static Object obj = new Object();
    private Singleton() {}
    public static Singleton getInstance() {
        if (singleton == null) { 
            synchronized (Singleton.class) { 
                if (singleton == null) { // double-checked locking (DCL) 
                    singleton = new Singleton();                 
                }
            }            
        }
        return singleton;
    }
}
```
> 双重检查锁定(DCL)已经相当完美了，但是还是有瑕疵，那就是编译器重排以及CPU的乱序执行会导致并发的线程有可能获得未完全初始化完成的对象。

参考：[单例模式中的volatile关键字](https://www.cnblogs.com/keeya/p/9260565.html)

通过使用**volatile**关键字来保证有序性
```
public class Singleton {
    private volatile static Singleton singleton = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (singleton == null) { 
            synchronized (Singleton.class) { 
                if (singleton == null) { // double-checked locking (DCL) 
                    singleton = new Singleton();                 
                }
            }            
        }
        return singleton;
    }
}
```
#### 更好的方式

##### 1. 静态内部类
```
public class Singleton {
    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }
    private Singleton() 
    public static Singleton getInstance() { 
        return SingletonHolder.singleton;
    }
}
```
> 由于静态内部类在使用时才加载所以可以到达延迟加载的效果，同时由于是类加载时static field初始化，避免了并发问题。

##### 2. 单值枚举
这是Effective Java 一书中推荐的方式
```
enum Singleton {
    INSTANCE;
    
    // Other field
    
    public void bizMethods() {
        //TODO
    }
}
```
> * 线程安全
> * 延迟加载
> * 序列化 

参考:
* [Effective Java](https://github.com/clxering/Effective-Java-3rd-edition-Chinese-English-bilingual/blob/master/Chapter-2/Chapter-2-Item-3-Enforce-the-singleton-property-with-a-private-constructor-or-an-enum-type.md)
* [整明白枚举单例模式](https://blog.csdn.net/tyn243222791/article/details/77712520)
* [为什么我墙裂建议大家使用枚举来实现单例](http://www.hollischuang.com/archives/2498)
### 原型模式 Prototype
简单理解就是克隆复制。原型模式在概念上分为：Prototype(原型，声明克隆方法或接口，可以是接口、抽象类、具体类)、ConcretePrototype(具体的原型, 实现克隆方法)。

在Java语言中，Object提供了clone()方法用于实现克隆。需要实现克隆/拷贝的类需要实现Cloneable接口。

针对克隆，有**浅拷贝(shallow copy)**和**深拷贝(deep copy)**之分，浅拷贝是分配一份与原对象一样的内存空间，然后将原对象内存空间内容，复制到现有内存空间内。所以如果域成员有引用对象，则指向地址跟原对象域成员一致，这就是为什么clone是浅拷贝的原因。

深拷贝是不仅内存地址不一样，所有域(主要是引用对象)内存地址也不一样。

> 另外，Java社区，对没有实现的Cloneable接口的对象的复制，提供了很多工具来实现bean复制，
例如Apache Commons BeanUtils, Spring BeanUtils， Cglib的BeanCopier等，这些大多数都是浅拷贝。
深拷贝一般都是需要自己实现，最高效的办法就是序列化后反序列化(需要类定义时实现 Serializable)。

一些Bean复制或类映射的工具：
* [Dozer](https://github.com/DozerMapper/dozer) [![Release Version](https://img.shields.io/maven-central/v/com.github.dozermapper/dozer-core.svg?maxAge=2592000)](https://mvnrepository.com/artifact/com.github.dozermapper/dozer-core)
* [Orika](http://orika-mapper.github.io/orika-docs/intro.html)
* [Cglib BeanCopier](https://github.com/cglib/cglib/blob/master/cglib/src/main/java/net/sf/cglib/beans/BeanCopier.java)
* [Hutool ObjectUtil](https://github.com/looly/hutool/blob/v4-master/hutool-core/src/main/java/cn/hutool/core/util/ObjectUtil.java)
* [Spring BeanUtils](https://github.com/spring-projects/spring-framework/blob/master/spring-beans/src/main/java/org/springframework/beans/BeanUtils.java)
* [Apache BeanUtils](https://github.com/apache/commons-beanutils/blob/master/src/main/java/org/apache/commons/beanutils2/BeanUtils.java)
##### 参考
1. [从JVM角度看看Java的clone操作](https://www.jianshu.com/p/309f80f33190)
