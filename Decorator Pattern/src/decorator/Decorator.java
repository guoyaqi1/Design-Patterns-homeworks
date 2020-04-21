package decorator;

public class Decorator extends Drink{
	private Drink obj;//单品咖啡
	
	
	public Decorator(Drink obj) {//组合
		this.obj=obj;
	}

	@Override
	public float cost() {
		//getPrice是自己的价格
		return super.getPrice()+obj.cost();
	}

	@Override
	public String getDes() {
		// obj.getDes()输出被装饰者的信息
		return des+ ""+ getPrice()+"&&"+obj.getDes();
	}
	
	

}
