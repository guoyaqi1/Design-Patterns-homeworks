package abstractFactory.order;

import abstractFactory.pizza.Pizza;

//һ�����󹤳�ģʽ�ĳ���㣨�ӿڣ�
public interface AbstractFactory {
	//������Ĺ�������������ʵ��
	public Pizza createPizza(String orderType);

	
	

}
