package abstractFactory.order;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import abstractFactory.pizza.Pizza;

public class OrderPizza {
	AbstractFactory factory;
	//������
	public OrderPizza(AbstractFactory factory) {
		setFactory(factory);
	}	
	private void setFactory(AbstractFactory factory) {
		Pizza pizza=null;
		String orderType="";//�û�����
		this.factory=factory;
		do {
			orderType=getType();
			//factory����ΪBJ�Ĺ������࣬Ҳ��Ϊ�׶ص�
			
			if(pizza!=null) {//����Ok
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();			
			}else {
				System.out.println("����ʧ��");
				break;
			}
		}while(true);
	}
	//дһ��������ȡ�ͻ������Pizza����
	private String getType() {
		try {
			BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			String str=strin.readLine();
			//retrun str;	
		}catch (IOException e) {
			e.printStackTrace();
		
		}
		return "";
		
	}

}
