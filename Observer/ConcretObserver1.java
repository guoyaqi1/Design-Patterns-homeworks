package designpattern.BehavioralPattern.Observer;

public class ConcretObserver1 implements ObserverO{

	@Override
	public void response(String subject) {
		System.out.println(subject+"发生改变.....1 收到了");
	}
	
}
