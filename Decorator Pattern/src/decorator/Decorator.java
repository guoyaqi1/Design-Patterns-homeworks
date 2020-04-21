package decorator;

public class Decorator extends Drink{
	private Drink obj;//��Ʒ����
	
	
	public Decorator(Drink obj) {//���
		this.obj=obj;
	}

	@Override
	public float cost() {
		//getPrice���Լ��ļ۸�
		return super.getPrice()+obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes()�����װ���ߵ���Ϣ
		return des+ ""+ getPrice()+"&&"+obj.getDes();
	}
	
	

}
