package designpattern.BehavioralPattern.Observer;

public class ConcreteSubjectA extends ASubject{

	@Override
	public void notifyObserbers() {
		for (ObserverO observerO : observers) {
			observerO.response("A");
		}
	}

}
