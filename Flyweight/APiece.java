package designpattern.Structural_Pattern.Flyweight;

public abstract class APiece {		// 棋子
	protected String kind;
	public APiece(String inkind) {
		kind = inkind;
	}
	// 下棋时落子的位置
	public abstract void play(int x,int y);

}
