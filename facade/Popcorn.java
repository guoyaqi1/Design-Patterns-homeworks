package facade;

public class Popcorn {//���׻�
	//ʹ�õ���ģʽ��������ʽ
	private static Popcorn instance=new Popcorn();
	
	public static Popcorn getInstance() {
		return instance;
	}
	public void on() {
		System.out.println("Popcorn on");
	}
	public void off() {
		System.out.println("Popcorn off");
	}
	public void pop() {
		System.out.println("Popcorn poping");
	}
		

}
