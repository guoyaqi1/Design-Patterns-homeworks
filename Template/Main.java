package designpattern.BehavioralPattern.Template;

/*
 * 模板方法模式:定义了一个操作中算法的骨架，将一些步骤延迟到子类中
 * 感觉没有什么好说的.....
 * */

public class Main {
	public static void main(String[] args) {
		ADefinitIntegral[] f = new ADefinitIntegral[2];	
		f[0] = new DefIntegralXX(0, 20, 10000);			// y = x|(20 0)
		f[1] = new DefIntegralLn(2.71, 20, 10000);		// lnX(20 2.71)
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i].CalDefiniteIntegral());
		}
	}
}
