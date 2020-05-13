package designpattern.BehavioralPattern.Observer;

public class ConcreteSubjectB extends ASubject{

	@Override
	public void notifyObserbers() {
		for (ObserverO observerO : observers) {
			observerO.response("B");
		}
	}

}
