package abstractFactory.order;



import abstractFactory.pizza.LDCheesePizza;
import abstractFactory.pizza.LDPepperPizza;
import abstractFactory.pizza.Pizza;

public class LDFactory implements AbstractFactory{

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("ʹ�õ��ǳ��󹤳�ģʽ");
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
