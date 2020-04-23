package composite;

public abstract class OrganizationComponent {
	
	private String name;//����
	private String des;//����
	
	protected void add(OrganizationComponent organizationComponent) {
		//Ĭ��ʵ�֡�
		throw new UnsupportedOperationException();
	}
	
	protected void remove(OrganizationComponent organizationComponent) {
		//Ĭ��ʵ�֡�
		throw new UnsupportedOperationException();
	}

	/**
	 ������
	 */
	public OrganizationComponent(String name, String des) {
		super();
		this.name = name;
		this.des = des;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	public String getDes() {
		return des;
	}

	
	public void setDes(String des) {
		this.des = des;
	}
	//����print,���ɳ���ģ����඼Ҫʵ��
	protected abstract void print();
	
	
	

}
