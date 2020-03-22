package HouseBuilder;
//��Ӧ����Ľ�����
public abstract class HouseBuilder {
	protected House house=new House();
	//�����������д�ã�����ķ���
	public abstract void buildBasic();
	public abstract void buildWall();
	public abstract void roofed();
	
	//���췿��,����Ʒ�����ӣ�����
	public House buildHouse() {
		return house;
	}

}
