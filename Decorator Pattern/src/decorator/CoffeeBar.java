package decorator;

public class CoffeeBar {

	public static void main(String[] args) {
		//ʵ�ֶ�����2���ɿ���+һ��ţ�̵�LongBlack
		
		//1.�ȵ�һ��LongBlack
		Drink order=new LongBlack();
		System.out.println("����1="+order.cost());
		System.out.println("����="+order.getDes());
		
		//2��order����һ��ţ��
		order=new Milk(order);
		System.out.println("order����һ��ţ�� ����="+order.cost());
		System.out.println("order����һ��ţ�� ����="+order.getDes());

		//3��order����һ���ɿ���
		order=new Chocolate(order);
		System.out.println("order����һ��ţ��  ����һ���ɿ���  ����="+order.cost());
		System.out.println("order����һ��ţ��  ����һ���ɿ���  ����="+order.getDes());
		
		//4��order����һ���ɿ���
		order=new Chocolate(order);
		System.out.println("order����һ��ţ��  ����һ���ɿ���  ����һ���ɿ���  ����="+order.cost());
		System.out.println("order����һ��ţ��  ����һ���ɿ���  ����һ���ɿ���  ����="+order.getDes());
	}

}
