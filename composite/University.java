package composite;

import java.util.ArrayList;
import java.util.List;

//University是Composite，可以管理College
public class University extends OrganizationComponent{
	
	List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();

	//构造器
	public University(String name, String des) {
		super(name, des);
		// TODO Auto-generated constructor stub
	}
	
	//重写add方法
	@Override
	protected void add(OrganizationComponent organizationComponent) {

		organizationComponents.add(organizationComponent);
	}
	//重写remove方法
	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		
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
