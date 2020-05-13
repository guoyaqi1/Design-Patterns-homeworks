package designpattern.BehavioralPattern.command;

import java.util.ArrayList;

public class WaiterInvoker {
	private ArrayList<Command> commands;		// 命令，拿一个小本本记录下来
	
	public WaiterInvoker() {
		super();
		commands = new ArrayList<Command>();
	}
	
	public void putCommand(Command command) {
		commands.add(command);
	}
	
	public void OrderUp() {
		System.out.println("订单来了...");
		for (Command command : commands) {
			if(command!=null)
				command.execute();
		}
	}
	
}
