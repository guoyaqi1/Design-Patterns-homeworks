package interfaceAdapter;

public class Client {

	public static void main(String[] args) {
		AbsAdapter absAdapter=new AbsAdapter() {
			//ֻ��Ҫ����������Ҫʹ�õĽӿڷ���
			public void m1() {
				System.out.println("ʹ����m1�ķ���");
			}
		};
		absAdapter.m1();

	}

}
