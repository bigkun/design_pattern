## 结构型设计模式
1. Adapter
2. Bridge
3. Composite
4. Decorator
5. Facade
6. Flyweight
7. Proxy

### 适配器模式
Adapter模式也称作Wrapper模式。现有代码无法直接使用，经过一定的转换或包装之后就能够使用的模式成为适配器模式。
将现有接口转换为客户类所期望的接口，实现了对现有类的复用。

> 将两个不兼容的类结合在一起使用，属于结构型模式，需要有Adaptee和Adapter两个角色。


Adapter模式中的概念：
1. Target: 目标，负责定义需要的方法
2. Adaptee: 被适配对象，已经存在一个或一些可以工作的方法，但并不直接符合Target要求，需要经过一定的转换才能满足要求。
3. Adapter: 适配对象，将Adaptee转换为Target

Adapter模式有两种：
* 类适配器模式（使用继承 is-a）
* 对象适配器模式（使用委托/组合 has-a）

Java并不支持多重类继承，因此类适配器模式会有些受限，比如Target不是接口，而是类；或者Adapter不是可继承（final）。所以java
中对象适配器模式使用的多一些。

何时使用Adapter模式：
1. 复用现有代码，但需要稍作调整时：
使用Adapter模式可以在完全不改变现有代码的前提下使现有代码适配于新的接口。
2. 版本升级与兼容：

### 桥接模式
如果存在两个或以上独立变化的维度，只依赖继承，会让子类繁多、继承层次加深，增加代码复杂度。通过使用桥接模式，使得各个维度独立扩展，最后动态进行组合。

桥接模式将抽象部分和实现部分分离，使它们可以独立地变化。

桥接模式角色：
1. Abstraction(抽象类): 用于定义抽象类的接口，一般是抽象类而不是接口.保存Implementor实例，并借由Implementor实现功能
2. RefinedAbstraction(改善后的抽象类): 在Abstraction的基础上增加新功能。
3. Implementor(实现者): 定义实现接口，接口不一定完全与Abstraction接口一致，Implementor接口仅提供最基本的操作，而Abstraction接口可能会做更多更复杂的操作。
4. ConcreteImplementor(具体实现者): 实现Implementor定义的接口。


![](https://gitee.com/bigkun/design_pattern/raw/master/structural/bridge.png)

> RefinedAbstraction 可以横向扩展，ConcreteImplementor也可以横向扩展，使用时动态的组合两者。