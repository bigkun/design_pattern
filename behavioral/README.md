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