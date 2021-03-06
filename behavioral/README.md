## 行为型设计模式
1. Chain of Responsibility
2. Command
3. Interpreter
4. Iterator
1. Mediator
1. Memento
1. Observer
1. State
1. Strategy
1. Template Method
1. Visitor

### 职责链模式
避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并沿着这条链传递请求，直到有对象处理它为止。

职责链模式中的概念：
1. Handler(抽象处理者): 定义处理请求的接口。
2. ConcreteHandler(具体处理者): 实现具体处理逻辑。在处理前，需要判断是否有相应的处理权限。若不能处理则转发给它的后继者。


使用CoR模式可以推卸请求，直至找到合适的处理请求的对象，但是这样也导致处理请求发生了延迟。
### 命令模式
命令模式可以将请求发送者和接收者完全解耦，发送者与接收者之间没有之间引用关系，发送请求的对象只需要知道如何发送请求，而不必知道如何完成请求。

1. Command(命令): 暴露 execute方法，调用接收者的业务处理方法
2. ConcreteCommand(具体命令): 绑定接收者
3. Receiver(接收者): 实现对请求的业务处理
4. Invoker(请求者): 创建请求命令，调用命令的 execute方法。

### 解释器模式
在某些情况下，为了更好地描述一些特定类型的问题，可以创建一种新的语言，这种语言拥有自己的表达式和结构，即文法规则。

解释器模式的定义：定义一个语言的文法，并建立一个解释器来解释该语言中的句子，这里的“语言”是指使用规定格式和语法的代码。解释器模式时一种类行为型模式。

由于表达式可以分为终结付表达式和非终结符表达式，因此解释器模式的结构与组合模式的结构有些类似，但在解释器模式中包含更多的组成元素。

解释器模式的概念：

* AbstractExpression(抽象表达式): 在抽象表达式中声明抽象的解释操作，它是所有终结符表达式和非终结符表达式的公共父类。
* TerminalExpression(终结符表达式): 是AbstractExpression子类，实现了终结符相关的解释操作。
* NonterminalExpression(非终结符表达式): 非终结符表达式也是抽象表达式的子类，它实现
了文法中非终结符的解释操作。由于非终结符表达式中可以包含终结符表达式，
也可以继续包含非终结符表达式，因此其解释操作一般通过递归地方式来完成。

* Context(上下文): 用于存储解释器之外的一些全局信息。通常它临时存储了需要解释的语句。
### 迭代器模式
对聚合类进行遍历操作的手段。

迭代器模式的概念：
1. Iterator(抽象迭代器): 定义访问和遍历元素的接口，声明了用于遍历数据元素的方法。
2. ConcreteIterator(具体迭代器): 实现Iterator接口，完成对聚合对象的遍历，同时在具体迭代器中通过游标来记录在聚合对象中所处的当前位置，在具体实现时，
游标通常是一个表示位置的非负整数。
3. Aggregate(抽象聚合类): 用于存储和管理元素对象，并声明一个能够获取迭代器对象的方法。
4. ConcreteAggregate(具体聚合类): 

### 中介者模式
中介者模式也叫调停者模式，Mediator就像十字路口的红绿灯，每辆车只需和红绿灯交互就可以。

用一个中介对象来封装一系列关于对象交互的行为。多个对象相互依赖的时候，使用中介者模式进行解耦，使得多对多的关系变成一对多的关系，降低系统的复杂性，提高可修改扩展性。

中介者模式是用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而是其耦合松散，而且可以独立地改变他们之间的关系。

中介者模式的概念：
1. Mediator(抽象中介者): 定义于各同事对象之间进行通信的接口。
2. ConcreteMediator(具体中介者): 通过协调各个同事对象来实现协作行为，维持对各个同事对象的引用。
3. Colleague(抽象同事类): 定义各个同事类公有方法，并声明一些抽象方法来供子类实现，同时维持一个对抽象中介者类的引用，子类可以通过该引用来与中介者通信。
4. ConcreteColleague(具体同事类): 每个同事对象在需要和其他同事对象通信时，先与中介者通信，通过中介者来间接完成与其他同事类的通信。

中介者承担了2方面职责：
1. 中转作用：通过中介者的中转，各个同事对象就不需要显式引用其他同事，当需要和其他同事进行通信时，可以通过中介者来实现间接调用。
2. 协调作用：中介者可以更进一步的对同事之间的关系进行封装，同事可以一致的和中介者进行交互，而不需要指明中介者需要具体怎么做。

### 备忘录模式
备忘录模式实现以下功能：撤销、重做、历史记录、快照。

备忘录模式是在不破坏封装的前提下，捕获对象的内部状态，并在该对象之外保存这个状态，这样可以在以后将对象恢复到原先保存的状态。

备忘录模式的概念：
1. Originator(生成者): 需要被保存状态的类
2. Memento(备忘录): 保存Originator的内部状态， 一般备忘录类拥有跟Originator一样的域。
3. Caretaker(负责人): 保存备忘录对象

### 观察者模式

观察者模式用于建立一种对象与对象之间的依赖关系，一个对象发生改变时将自动通知其他对象，其他对象将相应作出反应。

观察者模式中的概念：
1. Subject(目标): 目标又称为主题，它是指被观察的对象，在目标中定义了一个观察者集合，一个观察目标可以接受任意数量的观察者观察，它提供一系列方法来增加和
删除观察者对象，同时它定义了通知方法。
2. ConcreteSubject(具体目标): 通常包含有经常发生改变的数据，当它的状态发生改变时，向它的各个观察者发出通知。
3. Observer(观察者): 观察者将对观察目标的改变做出反应。
4. ConcreteObserver(具体观察者): 

### 状态模式
当系统中某个对象存在多个状态，这些状态之间可以进行转换，而且对象在不同的状态下行为不相同时可以使用状态模式。

状态模式中的概念：
1. Context(上下文): 持有表示当前状态的ConcreteState对象。
2. State(抽象状态类): 
3. ConcreteState(具体状态类):

### 策略模式
策略模式将算法和环境分开，不同的算法可以相互替换。

策略模式中的概念：
1. Context(上下文): 维持引用一个策略对象
2. Strategy(抽象策略类): 定义算法接口
3. ConcreteStrategy(具体策略类): 具体实现算法

### 模板方法模式
定义一个操作中算法的框架，而将一些步骤延迟到子类中。模板方法模式使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。

模板方法是一种基于继承的代码复用技术。

1. 模板方法：定义在抽象类中，把基本操作方法组合在一起形成一个总算法或一个总行为的方法。模板方法是一个具体方法，它给出了一个顶层逻辑框架，而逻辑的组成步骤在抽象类中可以
是具体方法，也可以说是抽象方法。由于模板方法是具体方法，因此模板方法模式中抽象层只能是抽象类，而不是接口。
2. 基本方法：是实现算法各个步骤的方法，是模板方法的组成部分。基本方法又可以分为三种：抽象方法、具体方法、钩子方法.

模板方法模式适应于有固定流程步骤的场景，但是不同情况下各环节由于细微差异。

### 访问者模式

1. visitor(访问者): 声明访问各种元素的visit方法
2. ConcreteVisitor: 实现各种访问接口。
3. Element(元素): 声明接受访问者的accept方法，参数是visitor
4. ConcreteElement: 负责实现accept方法
5. ObjectStructure: 负责处理Element角色的集合。

**双重分发**
* element.accept(visitor)
* visitor.visit(element)

element接受visitor,而visitor又访问element. 将这种消息分发称为双重分发(double dispatch)

> 访问者模式对增加visitor容易，对增加element困难，每增加一个element，就需要每个visitor都要添加对新增的element的visit方法。

