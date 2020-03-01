package abstractFactory.order;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import abstractFactory.pizza.Pizza;

public class OrderPizza {
	AbstractFactory factory;
	//构造器
	public OrderPizza(AbstractFactory factory) {
		setFactory(factory);
	}	
	private void setFactory(AbstractFactory factory) {
		Pizza pizza=null;
		String orderType="";//用户输入
		this.factory=factory;
		do {
			orderType=getType();
			//factory可以为BJ的工厂子类，也可为伦敦的
			
			if(pizza!=null) {//订购Ok
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();			
			}else {
				System.out.println("订购失败");
				break;
			}
		}while(true);
	}
	//写一个方法获取客户需求的Pizza种类
	private String getType() {
		try {
			BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza 种类:");
			String str=strin.readLine();
			//retrun str;	
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		return "";
		
	}

}
