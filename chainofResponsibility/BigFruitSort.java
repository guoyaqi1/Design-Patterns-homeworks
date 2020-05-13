package designpattern.BehavioralPattern.chainofResponsibility;

public class BigFruitSort extends AFruitSort{

	public BigFruitSort(int weight) {
		super(weight);
	}

	@Override
	protected void pushBox(String fruit, int weigth) {
		// TODO Auto-generated method stub
		fruitBox.add("超市:"+fruit+weigth);			// 大果放入超市的盒子中
	}

}
