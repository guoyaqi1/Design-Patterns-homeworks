package designpattern.BehavioralPattern.Vistor;

import java.util.ArrayList;
import java.util.List;

public class BuyBasket {
	List<IProduct> list = new ArrayList<IProduct>();
	
	public void accept(AVisitor visitor) {
		for (IProduct iProduct : list) {
			iProduct.accept(visitor);
		}
	}
	
	public void addProduct(IProduct p) {
		list.add(p);
	}
	
	public void removeProduct(IProduct p) {
		list.remove(p);
	}
}
