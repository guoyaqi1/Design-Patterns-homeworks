package designpattern.BehavioralPattern.Iterator;

/*
 * 迭代器模式:提供一种方法来访问聚合对象，而不用暴露这个对象的内部表示，其别名为游标。
 * 
 * Java中的Iterator类
 * 
 * 实现细节:一个对象聚合类(例如java中List)，和其具体实现类，然后一个迭代器(游标)（如java中iterator）
 * 		然后对象聚合类中有一个方法，可以得到这个类的访问类(迭代器)
 * ``*/

public class Main {
	public static void display(Television tv) {
		TVIterator i = tv.createIterator();
		System.out.println("电视机频道");
		while(!i.isLast()) {
			System.out.println(i.CurrentChannel());
			i.next();
		}
		System.out.println(i.CurrentChannel());
	}
	public static void main(String[] args) {
		display(new SkyworthTelevision());
	}
}
