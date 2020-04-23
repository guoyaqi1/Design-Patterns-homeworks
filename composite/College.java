package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

	//list��ŵ���Department
	List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();

	//������
	public College(String name, String des) {
		super(name, des);
		
	}
	
	//��дadd����
	@Override
	protected void add(OrganizationComponent organizationComponent) {

		//����ʵ��ҵ���У�College��add��University add��һ����ȫ��ͬ
		organizationComponents.add(organizationComponent);
	}
	//��дremove����
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		//����ʵ��ҵ���У�College��add��University remove��һ����ȫ��ͬ
		organizationComponents.remove(organizationComponent);
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		return super.getDes();
	}

	//print�������������University ������ѧԺ
	@Override
	protected void print() {
		System.out.println("-------------"+getName()+"-----------");
		//����organizationComponents
		for (OrganizationComponent organizationComponent:organizationComponents) {
			organizationComponent.print();
		}
	}

	

	

	

}
