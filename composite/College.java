package composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

	//list存放的是Department
	List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();

	//构造器
	public College(String name, String des) {
		super(name, des);
		
	}
	
	//重写add方法
	@Override
	protected void add(OrganizationComponent organizationComponent) {

		//将来实际业务中，College的add和University add不一定完全相同
		organizationComponents.add(organizationComponent);
	}
	//重写remove方法
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		//将来实际业务中，College的add和University remove不一定完全相同
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

	//print方法，就是输出University 包含的学院
	@Override
	protected void print() {
		System.out.println("-------------"+getName()+"-----------");
		//遍历organizationComponents
		for (OrganizationComponent organizationComponent:organizationComponents) {
			organizationComponent.print();
		}
	}

	

	

	

}
