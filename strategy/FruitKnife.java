package designpattern.BehavioralPattern.strategy;

public class FruitKnife implements ICutFruit {

	@Override
	public void CutStrategy(String fruitName) {
		System.out.println("水果刀切"+fruitName);
	}

}
