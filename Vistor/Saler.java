package designpattern.BehavioralPattern.Vistor;

public class Saler extends AVisitor {

	@Override
	public void visit(Apple apple) {
		System.out.println("收营员"+name+"给苹果收钱");
	}

	@Override
	public void visit(Book book) {
		System.out.println("收营员"+name+"给书收钱");
	}
}
