package objectAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==��������ģʽ===");
		Phone phone=new Phone();
		phone.charging(new VoltagAdapter(new Voltag220V()));

	}

}
