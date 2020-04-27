package facade;

public class Stereo {//立体声
	//使用单例模式——饿汉式
	private static Stereo instance=new Stereo();
	
	public static Stereo  getInstance() {
		return instance;
	}
	public void on() {
		System.out.println("Stereo on");
	}
	public void off() {
		System.out.println("Stereo off");
	}
}
