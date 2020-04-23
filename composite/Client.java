package composite;

public class Client {

	public static void main(String[] args) {
		// �Ӵ�С�������� ѧУ
		OrganizationComponent university=new University("�廪��ѧ","�й�������ѧ");
		
		//���� ѧԺ
		OrganizationComponent college1=new College("�����ѧԺ","�����ѧԺ");
		OrganizationComponent college2=new College("������ϢѧԺ","������ϢѧԺ");
		OrganizationComponent college3=new College("�����ѧԺ","�����ѧԺ");
		
		//��������ѧԺ�����ϵ(רҵ)
		college1.add(new Department("�������","������̲���"));
		college1.add(new Department("���繤��","���繤�̲���"));
		college1.add(new Department("�������ѧ�뼼��","�������ѧ�뼼������"));
		
		//
		college2.add(new Department("ͨ�Ź���","ͨ�Ź��̲���"));
		college2.add(new Department("��Ϣ����","��Ϣ���̲���"));
		
		//��ѧԺ���뵽ѧУ
		university.add(college1);
		university.add(college2);
		
		university.print();
		

	}

}
