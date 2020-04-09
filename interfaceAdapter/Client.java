package interfaceAdapter;

public class Client {

	public static void main(String[] args) {
		AbsAdapter absAdapter=new AbsAdapter() {
			//只需要覆盖我们需要使用的接口方法
			public void m1() {
				System.out.println("使用了m1的方法");
			}
		};
		absAdapter.m1();

	}

}
