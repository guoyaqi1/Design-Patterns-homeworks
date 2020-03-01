package abstractFactory.pizza;

public class LDPepperPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的胡椒Pizza");
		System.out.println("伦敦的胡椒Pizza 准备原材料");
	}

}
