package designpattern.BehavioralPattern.strategy;



/*策略模式:定义一系列算法，将每一个算法封装起来，并让它们可以相互替换
 * 
 * 就是定义一个抽象的算法类，然后每一个具体子类，实现一种算法
 
 * */

public class Main {
	public static void main(String[] args) {
		// 招聘一个厨师
		Chef chef = new Chef();
		// 指使厨师用什么策略
		chef.setCutMethod(new FruitKnife());
		chef.cutFruit("苹果");
		chef.setCutMethod(new MultiBlade());
		chef.cutFruit("西瓜");
		chef.setCutMethod(new HoriBlade());
		chef.cutFruit("菠萝");
	}
}
