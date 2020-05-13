package designpattern.BehavioralPattern.command;

import java.util.HashMap;

public class Order {
	private int id;									// 订单号
	private HashMap<String,Integer> orderList;		// 订单细节 key 名称 value 数量
	
	public Order() {
		id = hashCode();
		orderList = new HashMap<String, Integer>();
	}
	
	public void addOrder(String Fruit,int count) {					// 追加订单信息
		Integer value = orderList.get(Fruit);
		if(value == null)
			orderList.put(Fruit, count);
		else 
			orderList.put(Fruit, count+value);
	}
	
	public HashMap<String,Integer> getOrderList() {
		return orderList;
	}
	
	public int getId() {
		return id;
	}
} 
