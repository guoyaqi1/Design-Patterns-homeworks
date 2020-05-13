package designpattern.BehavioralPattern.command;

// 下订单的命令
public class OrderCommand implements Command {
	
	private Operator recevier;
	private Order order;
	
	// 一个执行者，一个目标。主语和宾语。
	public OrderCommand(Operator recevier,Order order) {
		this.order = order;
		this.recevier = recevier;
	}
	@Override
	public void execute() {
		recevier.markFruit(order);
	}

}
