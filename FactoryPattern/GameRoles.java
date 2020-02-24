package hk3_facotrypattern;

public abstract class GameRoles {
	
	private int phy_ack;		// 物理攻击
	private int mag_ack;		// 法术攻击
	private int phy_def;		// 物理防御
	private int mag_def;		// 法术防御
	
	abstract public void skillEffect();		// 技能效果
	
	
	public GameRoles(int phy_ack, int mag_ack, int phy_def, int mag_def) {
		super();
		this.phy_ack = phy_ack;
		this.mag_ack = mag_ack;
		this.phy_def = phy_def;
		this.mag_def = mag_def;
	}


	public GameRoles() {
		super();
	}


	public int getPhy_ack() {
		return phy_ack;
	}


	public void setPhy_ack(int phy_ack) {
		this.phy_ack = phy_ack;
	}


	public int getMag_ack() {
		return mag_ack;
	}


	public void setMag_ack(int mag_ack) {
		this.mag_ack = mag_ack;
	}


	public int getPhy_def() {
		return phy_def;
	}


	public void setPhy_def(int phy_def) {
		this.phy_def = phy_def;
	}


	public int getMag_def() {
		return mag_def;
	}


	public void setMag_def(int mag_def) {
		this.mag_def = mag_def;
	}
}
