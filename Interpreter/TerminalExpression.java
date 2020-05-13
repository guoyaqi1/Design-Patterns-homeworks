package designpattern.BehavioralPattern.Interpreter;

public class TerminalExpression implements Expression{
	String data;
	
	public TerminalExpression(String string) {
		data = string;
	}

	@Override
	public boolean interpret(String context) {
		if(context.contains(data)) return true;
		return false;
	}

}
