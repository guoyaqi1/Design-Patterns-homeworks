package facade;

public class TheaterLight {//�ƹ�
	//ʹ�õ���ģʽ��������ʽ
	private static TheaterLight  instance=new TheaterLight ();
	
	public static TheaterLight getInstance() {
		return instance;
	}
	public void on() {
		System.out.println("TheaterLight  on");
	}
	public void off() {
		System.out.println("TheaterLight  off");
	}
	public void dim() {
		System.out.println("TheaterLight  dim");
	}
}
