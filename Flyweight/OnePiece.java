package designpattern.Structural_Pattern.Flyweight;

public class OnePiece extends APiece{

	public OnePiece(String inkind) {
		super(inkind);
	}

	@Override
	public void play(int x, int y) {
		System.out.println(String.format("把%s子放在(%d,%d)", kind,x,y));
	}
	
	
}

