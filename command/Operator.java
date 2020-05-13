package designpattern.BehavioralPattern.command;

import java.util.HashMap;

public class Operator {
	
	private String name;
	public Operator(String name) {
		this.name = name;
	}
	public void markFruit(Order order) {
		HashMap<String, Integer> orderList = order.getOrderList();
		for (String fruit : orderList.keySet()) {
			System.out.println(name+"为您榨了"+orderList.get(fruit)+"个"+fruit);
		}
		System.out.println("混合搅拌中.........");
	}

}
