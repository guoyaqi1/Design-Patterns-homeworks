package abstractFactory.pizza;
//��Pizza���ɳ�����
public abstract class Pizza {
	protected String name;//pizza������
	
	public abstract void prepare();//׼��ԭ���ϣ���ͬ��pizzaԭ���ϲ�ͬ�����������Ϊ���󷽷���
	
	public void bake() {//�濾
		System.out.println(name+"baking;");
	}
	
	public void cut() {//�и�
		System.out.println(name+"cutting;");
	}
	
	public void box() {//���
		System.out.println(name+"boxing;");
	}
	
	public void setName(String name) {
		this.name=name;
	}
}
