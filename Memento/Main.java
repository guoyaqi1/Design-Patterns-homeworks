package designpattern.BehavioralPattern.Memento;

import javax.swing.undo.UndoableEdit;

/*
 * 备忘录模式:将一个对象的内部状态给保存下来，这样可以恢复到原先保存的状态。
 * 
 * 实现:
 * origiator(原发器):可以创建备忘录，并且使用备忘录恢复其内部状态。，一般将内部状态需要保存的类设计为原发器。
 * Memento(备忘录):存储原发器内部状态，根据原发器来决定保存那些内部状态
 * Caretaker(负责人):管理者，负责保存备忘录。
 * */
public class Main {
	private static int index = -1;
	private static CaretakerChess caretakerChess = new CaretakerChess();
	public static void play(OriginatorChess chess) {
		index++;
		caretakerChess.addMen(chess.saveToMemento());
		chess.Show();
	}
	
	public static void undo(OriginatorChess chess) {
		chess.restore(caretakerChess.getMem(--index));
		chess.Show();
	}
	
	public static void redo(OriginatorChess chess) {
		chess.restore(caretakerChess.getMem(++index));
		chess.Show();
	}
	
	public static void main(String[] args) {
		OriginatorChess chess = new OriginatorChess(
				new MementoChess("黑", 2, 2));
		play(chess);			// 2,2下一颗
		chess.setX(3);			
		play(chess);			// 3,2下一颗
		chess.setY(6);			// 3,6下一颗
		play(chess);
		
		undo(chess);
		undo(chess);
		redo(chess);
		redo(chess);	


	}
}
