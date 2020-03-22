package HouseBuilder;

public class CommonHouse extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("给普通房子打地基5米");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("给普通房子砌墙10cm");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("给普通房子盖透明屋顶");
	}

}
