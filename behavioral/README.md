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
