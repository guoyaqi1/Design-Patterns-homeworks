package HouseBuilder;

public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		// TODO Auto-generated method stub
		System.out.println("给高楼房子打地基100米");
	}

	@Override
	public void buildWall() {
		// TODO Auto-generated method stub
		System.out.println("给高楼房子砌墙20cm");
	}

	@Override
	public void roofed() {
		// TODO Auto-generated method stub
		System.out.println("给高楼盖透明屋顶");
	}

}
