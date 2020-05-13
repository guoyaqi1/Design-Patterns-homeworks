package designpattern.BehavioralPattern.chainofResponsibility;

public class MidFruitSort extends AFruitSort{

	public MidFruitSort(int weight) {
		super(weight);
	}

	@Override
	protected void pushBox(String fruit, int weigth) {
		// TODO Auto-generated method stub
		fruitBox.add("水果罐头:"+fruit+weigth);
	}

}
