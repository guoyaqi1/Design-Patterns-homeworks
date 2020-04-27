package facade;

public class DVDPlayer {
	//ʹ�õ���ģʽ��������ʽ
	private static DVDPlayer instance=new DVDPlayer();
	
	public static DVDPlayer getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println("dvd on");
	}

	public void off() {
		System.out.println("dvd off");
	}
	
	public void play() {
		System.out.println("dvd play");
	}
	public void pause() {
		System.out.println("dvd pause");
	}
}
