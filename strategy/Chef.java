package designpattern.BehavioralPattern.strategy;

public class Chef {
	ICutFruit cutMethod;
	
	public void setCutMethod(ICutFruit cutMethod) {
		this.cutMethod = cutMethod;
	}
	
	public void cutFruit(String fruitName) {
		if(cutMethod != null) cutMethod.CutStrategy(fruitName);
	}

}
