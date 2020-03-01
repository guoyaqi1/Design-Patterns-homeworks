package abstractFactory.order;



import abstractFactory.pizza.LDCheesePizza;
import abstractFactory.pizza.LDPepperPizza;
import abstractFactory.pizza.Pizza;

public class LDFactory implements AbstractFactory{

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("使用的是抽象工厂模式");
		// TODO Auto-generated method stub
		Pizza pizza=null;
		if(orderType.equals("cheese")) {
			pizza=new LDCheesePizza();
		}else if(orderType.equals("pepper")) {
			pizza=new LDPepperPizza();
		}
		return null;
	}

	
	

	
	
}
