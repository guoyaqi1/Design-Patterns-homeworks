package hk3_facotrypattern;

public class Assassin extends GameRoles{

	@Override
	public void skillEffect() {
		System.out.println("突击到敌方面前，对单体造成大量伤害");
	}

	public Assassin() {
		super();
	}

	public Assassin(int phy_ack, int mag_ack, int phy_def, int mag_def) {
		super(phy_ack, mag_ack, phy_def, mag_def);
	}

}
