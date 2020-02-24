package hk3_facotrypattern;

public class Soldier extends GameRoles{

	@Override
	public void skillEffect() {		
		System.out.println("增加自己的攻击和防御，并且对沿途敌人造成少量伤害");
	}

	public Soldier() {
		super();
	}

	public Soldier(int phy_ack, int mag_ack, int phy_def, int mag_def) {
		super(phy_ack, mag_ack, phy_def, mag_def);
	}

}
