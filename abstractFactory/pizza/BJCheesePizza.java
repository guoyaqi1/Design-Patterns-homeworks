package abstractFactory.pizza;

public class BJCheesePizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的奶酪Pizza");
		System.out.println("北京的奶酪Pizza 准备原材料");
	}

}
