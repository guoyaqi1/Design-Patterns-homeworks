package designpattern.BehavioralPattern.chainofResponsibility;

import java.util.Random;

/*
 * 职责链模式:让多个对象都有可能接收请求。将接收请求的对象连成一条链，并沿着这条链传递请求。
 * 
 * 重点:不一定是直线的链条，可能是树，或者是环
 * 	  避免请求接收者与发送者耦合（命令模式应该也是,一个包装了请求，一个包装了请求接收者）
 * 
 * 
 * 实现细节:请求接收者给连成链
 * 			然后给据某些条件将请求处理(也可以推给不同的处理者,也算是进行第一步处理)
 * 
 * 如果利用点单的例子（和命令模式结合起来):
 * 	waiter(invoke)是命令的接收者（订单），同时是命令的提交者（提交订单给后厨）
 * 	cook(Operator)是命令的实际执行者（榨果汁）。在命令模式中Operator是Client指定的。
 * 	但是，餐馆里面客人一般是不会知道后厨有哪些的。
 *     --所以在实际过程中，应该有一个订单交由谁处理的一个判断过程（某些厨师做某些菜）。
 *     这样可以给waiter一台电脑（职责链）,在orderUp(Command例子中的Waiter的一个方法),使用职责链将，
 *     不同的菜叫给不同的入处理(给Command对象设置一个receiver,然后执行)。没有改动太多
 * */

public class Main {
	// 水果筛选工作线
	public static void main(String[] args) {
		// 首先建立一条工作线(生成一条职责链)
		AFruitSort SortLine = BuilderSortChain();
		// 水果来了（请求）
		Random rm = new Random();
		for(int i = 0;i<100;i++) {
			int weight = rm.nextInt(15);		
			// 传到工作线上
			SortLine.sendFruit(weight, "苹果");		// 分发请求
		}
		
		// 然后看看分类结果
		SortLine.getChainBox();
	}
	
	private static AFruitSort BuilderSortChain() {
		AFruitSort bfs,mfs,sfs;
		bfs = new BigFruitSort(9);
		mfs = new MidFruitSort(5);
		sfs = new SmallFruitSort(2);
		bfs.setNextSort(mfs);
		mfs.setNextSort(sfs);
		return bfs;
	}
}
