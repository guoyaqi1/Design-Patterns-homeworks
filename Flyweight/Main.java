package designpattern.Structural_Pattern.Flyweight;

import java.util.Random;

/*
 * 享元模式:将一个类重复使用的状态或者属性共享。
 * 
 * 内部状态:共享的部分
 * 外部状态，非共享的部分
 * 
 * 比如棋子的颜色大小什么的就可以用只存一份。
 * 位置就不能一样
 * 
 * */

public class Main {
		public static void main(String[] args) {
			PieceFacotry pFacotry = new PieceFacotry();
			Random rm = new Random();
			for(int i =0 ;i<19;i++) {
				for(int j =0;j<19;j++) {
					APiece p;
					if(rm.nextInt()%2==0) {
						p = pFacotry.getPiece("黑子");
					}
					else
						p = pFacotry.getPiece("白子");
					p.play(rm.nextInt(19), rm.nextInt(19));
				}
			}
			
			System.out.println("总棋子的个数是"+pFacotry.GetPieceCount());
		}
}
