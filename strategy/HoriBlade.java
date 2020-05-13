package designpattern.BehavioralPattern.strategy;

public class HoriBlade implements ICutFruit {

	@Override
	public void CutStrategy(String fruitName) {
		System.out.println(fruitName+"碎了");
	}

}
