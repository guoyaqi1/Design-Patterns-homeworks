package HouseBuilder;
//指挥者。这里动态的指定制作流程，返回具体的产品
public class HouseDirector {
	
	HouseBuilder housebuildr=null;

	/**
	 * 构造器传入houseBuilder
	 */
	public HouseDirector(HouseBuilder housebuildr) {
		super();
		this.housebuildr = housebuildr;
	}
	

	/**
	 *通过setter传入houseBuilder
	 */
	public void setHousebuildr(HouseBuilder housebuildr) {
		this.housebuildr = housebuildr;
	}
	
	//如何处理建造房子的流程，交给指挥者
	public House constructHouse() {
		housebuildr.buildBasic();
		housebuildr.buildWall();
		housebuildr.roofed();
		return housebuildr.buildHouse();
		
	}

}
