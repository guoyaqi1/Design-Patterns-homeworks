package facade;

public class Projector {//ͶӰ��
	//ʹ�õ���ģʽ��������ʽ
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
