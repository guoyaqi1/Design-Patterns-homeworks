package HouseBuilder;

public class Client {

	public static void main(String[] args) {
		// ����ͨ����
		CommonHouse commonHouse=new CommonHouse();
		//׼���������ӵ�ָ����
		HouseDirector houseDirector=new HouseDirector(commonHouse);
		
		//��ɸǷ��ӣ����ز�Ʒ�����ӣ�
		House house =houseDirector.constructHouse();
		
		System.out.println("---------------------------");
		
		//�Ǹ�¥
		HighBuilding highbuilding =new HighBuilding();
		//���ý�����
		houseDirector.setHousebuildr(highbuilding);
		//��ɸǷ��ӣ����ز�Ʒ����¥��
		houseDirector.constructHouse();

	}

}
