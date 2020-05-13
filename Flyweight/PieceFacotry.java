package designpattern.Structural_Pattern.Flyweight;

import java.util.HashMap;

public class PieceFacotry {
	private HashMap<String, APiece> piecePool = new HashMap<String, APiece>();
	
	public APiece getPiece(String key) {
		if(!piecePool.containsKey(key)) {
			APiece p = new OnePiece(key);
			piecePool.put(key,p);
			return p;
		}
		return (APiece) piecePool.get(key);

	}
	
	public int GetPieceCount() {
		return piecePool.size();
	}
}
