package designpattern.BehavioralPattern.Observer;

public class ConcretObserver2 implements ObserverO{

	@Override
	public void response(String subject) {
		System.out.println(subject+"发生改变.....2 收到了");
	}
	
}
