package designpattern.BehavioralPattern.Memento;

public class MementoChess implements Cloneable{
	private String lable;
	private int x,y;
	
	
	
	public MementoChess(String lable, int x, int y) {
		super();
		this.lable = lable;
		this.x = x;
		this.y = y;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}




	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getLable() {
		return lable;
	}

	public int getX() {
		return x;
	}
	
}
