package designpattern.BehavioralPattern.Memento;

public class OriginatorChess {
	private MementoChess memChess;
	
	public OriginatorChess(MementoChess mem) {
		memChess = mem;
	}
	
	public void setX(int x) {
		memChess.setX(x);
	}
	
	public void setY(int y) {
		memChess.setY(y);
	}
	
	public MementoChess saveToMemento() {
		try {
			return (MementoChess) memChess.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void restore(MementoChess mem) {
		this.memChess.setLable(mem.getLable());
		this.memChess.setX(mem.getX());
		this.memChess.setY(mem.getY());
	}
	
	public void Show() {
		System.out.println("当前棋子状态:"
				+ memChess.getLable()+
				"("
				+memChess.getX()
				+","
				+memChess.getY()
				+")");
	}
}
