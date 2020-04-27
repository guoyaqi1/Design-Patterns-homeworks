package facade;

public class Projector {//投影仪
	//使用单例模式——饿汉式
		private static Projector instance=new Projector();
		
		public static Projector getInstance() {
			return instance;
		}
		public void on() {
			System.out.println("Projector on");
		}
		public void off() {
			System.out.println("Projector off");
		}
		public void pop() {
			System.out.println("Projector proing");
		}

}
