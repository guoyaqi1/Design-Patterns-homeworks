package designpattern.BehavioralPattern.command;

/*
 *命令模式:将请求封装成一个对象，从而使我们可以用不同的请求对客户进行参数化，对请求排队或者记录请求日志，以及支持可撤销的操作
 *
 *主要是将命令封装起来。同时把命令的记录和提交 交由一个对象处理(invoke),但是把命令的发送者和接收者给分开。
 *
 *不算客户端共有3个结构；
 *invoke:  接收命令，然后记录在小本本上，最后在执行的对象。
 *Operator:执行命名的人
 *Command:命令的封装,(同时包含执行)
 *
 *细节:Operator比较简单，记录操作员的信息。
 *Command：要包含命令细节（如例子中的订单细节）,同时需要抽象出一个执行的接口，方便invoke调用(因此内部也需要指派操作员)
 *invoke:接收客户端的命令，同时在合适的时候把提交命令（调用command接口中的execute）。
 * */

public class Main {
	public static void main(String[] args) {
		// 首先开一家生榨果汁店
		// 然后招聘一个服务员
		WaiterInvoker waiterInvoker = new WaiterInvoker();
		// 然后招聘一个后厨
		Operator recevier = new Operator("大厨一号");
		// 等客人来。。。
		
		// 来客人了，客人要点单了。
		Order order = new Order();
		order.addOrder("苹果", 4);     		// 先来4个苹果
		order.addOrder("香蕉", 50); 			// 再来50个香蕉
		order.addOrder("苹果", 40);      	// 4个苹果能榨多少果汁,再加40个苹果
		// 然后想好了						// 应该够喝了
		Command orderCommand = new OrderCommand(recevier, order);		// 只有一个厨师
		// "服务员你过来一下，我下单了"
		waiterInvoker.putCommand(orderCommand);
		// "XX您稍等..."
		// 然后服务员将订单提交
		waiterInvoker.OrderUp();
		// 然后不知道果汁怎么飘来的
		// "滋滋....，味道不错"
		// 然后。。。。。。。。。。（这家店老板好像有点傻，不会收钱）
	}

}
