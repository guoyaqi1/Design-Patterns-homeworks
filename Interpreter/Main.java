package designpattern.BehavioralPattern.Interpreter;

/*
 * 解释器模式:给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器使用该标识来解释语言中的句子
 * */

public class Main {
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarried = getMarriedExpression();
		System.out.println("john is male?"+isMale.interpret("john"));
		System.out.println("sss is male?"+isMale.interpret("sss"));
		System.out.println("julie is married?"+isMarried.interpret("julie married"));
		System.out.println("xxx is married?"+isMarried.interpret("xxx"));

	}
	
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("robert");
		Expression john = new TerminalExpression("john");
		return new OrExpression(robert, john);
	}
	
	public static Expression getMarriedExpression() {
		Expression julie = new TerminalExpression("julie");
		Expression married = new TerminalExpression("married");
		return new AndExpression(julie, married);
	}
}	
