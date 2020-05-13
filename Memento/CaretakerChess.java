package designpattern.BehavioralPattern.Memento;

import java.util.ArrayList;

public class CaretakerChess {
	private ArrayList<MementoChess> memList = new ArrayList<MementoChess>();
	public void addMen(MementoChess mem) {
		memList.add(mem);
	}
	
	public MementoChess getMem(int i) {
		return memList.get(i);
	}
}
