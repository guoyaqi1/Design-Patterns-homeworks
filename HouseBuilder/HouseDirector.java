package HouseBuilder;
//ָ���ߡ����ﶯ̬��ָ���������̣����ؾ���Ĳ�Ʒ
public class HouseDirector {
	
	HouseBuilder housebuildr=null;

	/**
	 * ����������houseBuilder
	 */
	public HouseDirector(HouseBuilder housebuildr) {
		super();
		this.housebuildr = housebuildr;
	}
	

	/**
	 *ͨ��setter����houseBuilder
	 */
	public void setHousebuildr(HouseBuilder housebuildr) {
		this.housebuildr = housebuildr;
	}
	
	//��δ����췿�ӵ����̣�����ָ����
	public House constructHouse() {
		housebuildr.buildBasic();
		housebuildr.buildWall();
		housebuildr.roofed();
		return housebuildr.buildHouse();
		
	}

}
