package designpattern.BehavioralPattern.chainofResponsibility;

public class SmallFruitSort extends AFruitSort{

	public SmallFruitSort(int weight) {
		super(weight);
	}

	@Override
	protected void pushBox(String fruit, int weigth) {
		// TODO Auto-generated method stub
		fruitBox.add("果汁:"+fruit+weigth);
	}

}
