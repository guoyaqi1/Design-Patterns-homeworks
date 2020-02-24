package hk3_facotrypattern;

public class Master extends GameRoles{

	@Override
	public void skillEffect() {
		System.out.println("对敌方造成大范围的巨额伤害");
	}

	public Master() {
		super();
	}

	public Master(int phy_ack, int mag_ack, int phy_def, int mag_def) {
		super(phy_ack, mag_ack, phy_def, mag_def);
	}

}
