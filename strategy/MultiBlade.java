package designpattern.BehavioralPattern.strategy;

public class MultiBlade implements ICutFruit {

	@Override
	public void CutStrategy(String fruitName) {
		System.out.println(fruitName + "被切成了8片");
	}

}
