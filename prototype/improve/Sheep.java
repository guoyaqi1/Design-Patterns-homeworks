package prototype.improve;

public class Sheep implements Cloneable{
	private String name;
	private int age;
	private String color;
	private String address="�ɹ�";
	public Sheep friend;//�Ƕ��� ��¡ʱ����δ���
    
	public Sheep(String name, int age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", address=" + address + "]";
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//��¡��ʵ����ʹ��Ĭ�ϵĿ�¡����
	@Override
	protected Object clone()  {
		Sheep sheep=null;
		
		try {
			sheep=(Sheep)super.clone();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
		return sheep;
	}
	

}
