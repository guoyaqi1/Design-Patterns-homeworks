package Singleton;



public class SingletonTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		Singleton instance=Singleton.getInstance();
		Singleton instance2=Singleton.getInstance();
        System.out.println(instance==instance2);
        
	}

}
//����ʽ(��̬����)
 class Singleton{
	//1.����˽�л����ⲿ��new
	private Singleton() {
		
	}
	//2.�����ڲ���������ʵ��
	private final static Singleton instance=new Singleton();
	
	//3.�ṩһ�����еľ�̬����������ʵ������
	public static Singleton getInstance() {
		return instance;
	}
}