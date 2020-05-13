package designpattern.BehavioralPattern.Vistor;

/*
 * 访问者模式:使我们可以在不改变各元素类的前提下定义作用于这些元素的新操作
 * 
 * 不同的使用者对于同一种数据可以有不同的操作方式,
 * 访问者模式就是可以满足开闭原则的前提下添加新操作，来满足不同的使用者
 * 
 * 从例子中可以看出，添加新的访问方式很简单，新建一个实现类就可以了
 * 但是如果要添加访问元素（iProduct）,要修改AVistor。
 * 
 * 实现细节：
 * Visitor：访问者基类，定义了要访问的元素（提供抽象的方法来定义）有哪些。
 * ConcreteVisiot:访问者的实现类，里面有具体的方法方法。
 * IElement:被访问的对象的接口。通常要添加一个accept方法，来給visitor访问
 * ConcretElement:具体的访问元素
 * 
 * ElementCollection:（对IElement的管理），可以不要
 * */

public class Main {
	public static void main(String[] args) {	
		// 准备好商品
		IProduct b1 = new Book();
		IProduct b2 = new Book();
		IProduct a1 = new Apple();
		BuyBasket b = new BuyBasket();
		// 准备好对象
		AVisitor v;
		
		// 顾客来了
		v = new Customer();
		v.setName("张三");
		// 往购物车里加了两本书和一个苹果
		b.addProduct(b1);
		b.addProduct(b2);
		b.addProduct(a1);
		// 然后顾客看一下购物车，看一下还缺什么
		b.accept(v);
		// 够了结账
		// 来了一个收营员员
		v = new Saler();
		v.setName("一号");
		b.accept(v);

		
	}
}
