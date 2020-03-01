package abstractFactory.pizza;

public class LDCheesePizza extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的奶酪Pizza");
		System.out.println("伦敦的奶酪Pizza 准备原材料");
	}

}
