package designpattern.BehavioralPattern.chainofResponsibility;

import java.util.ArrayList;
import java.util.List;

public abstract class AFruitSort {						// 处理器
	private int weight;							
	protected List<String> fruitBox;			// 水果篮
	private AFruitSort nextFruitSort;			// 指向下一条处理者，树行结果中有多个
	
	
	public AFruitSort(int weight) {	
		super();
		this.weight = weight;
		fruitBox = new ArrayList<String>();
	}

	public void getChainBox() {				// 输出当前职责链上的所有水果
		AFruitSort temp = this;
		while(temp!=null) {
			temp.getFruitBox();
			temp = temp.nextFruitSort;
		}
	}
	
	public void getFruitBox() {					// 输出当前水果篮中的水果

		System.out.println("Weigth:"+weight);
		System.out.println("个数:"+fruitBox.size());
		for (String string : fruitBox) {
			System.out.println(string+",");
		}
		System.out.println();
		
	}
	
	public void setNextSort(AFruitSort nextSort) {
		this.nextFruitSort = nextSort;
	}
	
	// 关键函数，把职责链连起来
	public void sendFruit(int weight,String fruit) {
		// 职责之内
		if(weight>this.weight) pushBox(fruit,weight);
		// 职责之外
		else {
			if(nextFruitSort != null)				
				nextFruitSort.sendFruit(weight, fruit);
		}
	}
	
	// 把水果装入篮中
	abstract protected void pushBox(String fruit,int weigth);
}
