package prototype.deepclone;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepProtoType p=new DeepProtoType();
		p.name="������";
		p.deepCloneableTarget=new DeepCloneableTarget("��ţ","��ţ����");
		
		//��ʽһ��������
		
//		DeepProtoType p2=(DeepProtoType) p.clone();
//		
//		System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
//		System.out.println("p2.name="+p2.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());

		//��ʽ����������
		DeepProtoType p2=(DeepProtoType) p.deepClone();
		
		System.out.println("p.name="+p.name+"p.deepCloneableTarget="+p.deepCloneableTarget.hashCode());
		System.out.println("p2.name="+p2.name+"p2.deepCloneableTarget="+p2.deepCloneableTarget.hashCode());

	}

}
