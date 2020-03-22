package prototype.deepclone;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepProtoType p=new DeepProtoType();
		p.name="郭雅琦";
		p.deepCloneableTarget=new DeepCloneableTarget("大牛","大牛的类");
		
		//方式一：完成深拷贝
		
//		DeepProtoType p2=(DeepProtoType) p.clone();
//		
//		System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name="+p2.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());

		//方式二：完成深拷贝
		DeepProtoType p2=(DeepProtoType) p.deepClone();
		
		System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
		System.out.println("p2.name="+p2.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());

	}

}
