package prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream;
public class DeepProtoType implements Serializable, Cloneable{
	
	
	public String name;//String����
	public DeepCloneableTarget deepCloneableTarget;//��������
	/**
	 * @param name
	 * @param deepCloneableTarget
	 */
	public DeepProtoType() {
		super();
		
	}
	//���--��ʽһʹ��clone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep=null;
		//������ɶԻ����������ͺ�String�Ŀ�¡
		deep=super.clone();
		//���������͵����Խ��е�������
		DeepProtoType deepProtoType=(DeepProtoType) deep;
		deepProtoType.deepCloneableTarget=(DeepCloneableTarget) deepCloneableTarget.clone();
		
		// TODO Auto-generated method stub
		return deepProtoType;
	}
	//���--��ʽ�� ͨ����������л�ʵ�֣��Ƽ���
	public Object deepClone() {
		//����������
		ByteArrayOutputStream bos=null;
		ObjectOutputStream oos=null;
		ByteArrayInputStream bis=null;
		ObjectInputStream ois=null;
		
		try {
			//���л�
			bos=new ByteArrayOutputStream();
			oos=new ObjectOutputStream(bos);
			oos.writeObject(this);//��ǰ��������Զ������ķ�ʽ���
			
			//�����л�
			bis=new ByteArrayInputStream(bos.toByteArray());
			ois=new ObjectInputStream(bis);
			DeepProtoType copyObj=(DeepProtoType) ois.readObject();
			
			return copyObj;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			//�ر���
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			}catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
		
		
	}
	

}
