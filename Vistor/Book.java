package designpattern.BehavioralPattern.Vistor;

public class Book implements IProduct{

	@Override
	public void accept(AVisitor visitor) {
		visitor.visit(this);
	}

}
