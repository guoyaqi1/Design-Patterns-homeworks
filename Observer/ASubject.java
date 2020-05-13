package designpattern.BehavioralPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ASubject {
	protected List<ObserverO> observers = new ArrayList<ObserverO>();
	
	public void add(ObserverO observer) {
		observers.add(observer);
	}
	
	public void remover(ObserverO o) {
		observers.remove(o);
	}
	
	public abstract void notifyObserbers();
	
}
