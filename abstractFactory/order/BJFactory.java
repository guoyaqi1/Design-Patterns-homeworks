package abstractFactory.order;

import abstractFactory.pizza.BJCheesePizza;
import abstractFactory.pizza.BJPepperPizza;
import abstractFactory.pizza.Pizza;
//����һ����������
public class BJFactory implements AbstractFactory{

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("ʹ�õ��ǳ��󹤳�ģʽ");
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
