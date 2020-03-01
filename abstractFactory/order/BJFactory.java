package abstractFactory.order;

import abstractFactory.pizza.BJCheesePizza;
import abstractFactory.pizza.BJPepperPizza;
import abstractFactory.pizza.Pizza;
//这是一个工厂子类
public class BJFactory implements AbstractFactory{

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用的是抽象工厂模式");
		// TODO Auto-generated method stub
		Pizza pizza=null;
		if(orderType.equals("cheese")) {
			pizza=new BJCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza=new BJPepperPizza();
		}
		return pizza;
	}

}
