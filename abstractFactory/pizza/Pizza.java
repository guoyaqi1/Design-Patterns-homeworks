package abstractFactory.pizza;
//将Pizza做成抽象类
public abstract class Pizza {
	protected String name;//pizza的名字
	
	public abstract void prepare();//准备原材料，不同的pizza原材料不同，因此我们作为抽象方法；
	
	public void bake() {//烘烤
		System.out.println(name+"baking;");
	}
	
	public void cut() {//切割
		System.out.println(name+"cutting;");
	}
	
	public void box() {//打包
		System.out.println(name+"boxing;");
	}
	
	public void setName(String name) {
		this.name=name;
	}
}
