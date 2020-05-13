package designpattern.BehavioralPattern.Template;

public class DefIntegralXX extends ADefinitIntegral{
	private double a,b;
	private int c;
	
	public DefIntegralXX(double a, double b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	protected double geta() {return a;}

	@Override
	protected double getb() {return b;}

	@Override
	protected int getc() {return c;}

	@Override
	protected double function(double x) {
		return x;
	}
	

	
}
