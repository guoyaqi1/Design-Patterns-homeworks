package designpattern.BehavioralPattern.Observer;

/*观察者模式:当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新
 * 
 * MVC:三层架构
 * 降低了目标和观察者之间的耦合关系
 * 
 * 注意事项：被依赖的是目标，是目标通知给观察者。
 * 
 * 感觉结构还是比较简单的。就是目标中有一个能存储观察者的表，
 * 然后状态发生改变时，逐个调用观察者中的response方法。(不同的具体目标调用的方式应该有所差距)
 * */

public class Main {
	public static void main(String[] args) {
		ASubject a = new ConcreteSubjectA();
		ASubject b= new ConcreteSubjectB();
		
		for(int i = 0 ;i<5;i++) {
			if(((int)(Math.random()*10))%2==0){
				a.add(new ConcretObserver1());
				b.add(new ConcretObserver2());
			}
			else {
				a.add(new ConcretObserver2());
				b.add(new ConcretObserver1());
			}		
		}
		a.notifyObserbers();
		b.notifyObserbers();
	}
}
