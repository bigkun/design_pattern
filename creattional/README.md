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
    * 一个具体工厂类，只能生产同一种产品
    * 工厂和产品绑定唯一
    * 侧重垂直扩展
* Abstract Factory: 
    * 使用不同的工厂实例(同一父类)生产不同的产品
    * 重在零件拼装，组合出产品
    * 工厂和零件绑定，可以组合出多种产品
    * 侧重水平扩展
> 
> * [小谈抽象工厂模式与工厂方法，Abstract Factory Pattern and Factory Method](https://blog.csdn.net/gusgao/article/details/52177069)
> * [Factory Method vs Abstract Factory](https://blog.csdn.net/u010373266/article/details/53764737)

#### 总结
> 1. **简单工厂模式**实现比较简单统一的工厂类，根据不同参数实例化不同的具体类产品，扩展需要改动工厂类逻辑。
> 2. **工厂方法模式**和**抽象工厂模式** 都做到了开闭原则，对扩展可以不改动现有代码。
> 3. **抽象工厂模式** 最大的不同点在于生产一组产品，有多个create方法实例化多种子产品，最后将各种子产品组合成产品。

