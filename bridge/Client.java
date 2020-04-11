package bridge;

public class Client {

	public static void main(String[] args) {
		// ��ȡ�۵�ʽ�ֻ�����ʽ+Ʒ�ƣ�
		Phone phone1=new FoldedPhone(new XiaoMi());
		phone1.open();
		phone1.close();
		phone1.call();
		
        System.out.println("----------------------------");
        
		Phone phone2=new FoldedPhone(new Vivo());
		phone2.open();
		phone2.close();
		phone2.call();
		
		 System.out.println("----------------------------");
		 
		 UpRightPhone phone3=new UpRightPhone(new XiaoMi());
		 phone3.open();
		 phone3.close();
		 phone3.call();
		 
		 System.out.println("----------------------------");
		 
		 UpRightPhone phone4=new UpRightPhone(new Vivo());
		 phone4.open();
		 phone4.close();
		 phone4.call();
	}

}
