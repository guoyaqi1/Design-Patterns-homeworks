package abstractFactory.pizza;

public class BJPepperPizza extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的胡椒Pizza");
		System.out.println("北京的胡椒Pizza 准备原材料");
	}

}
