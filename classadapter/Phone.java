package classadapter;

public class Phone {
//���ķ���
	public void charging(IVoltag5V iVoltag5V) {
		if(iVoltag5V.output5V()==5) {
			System.out.println("��ѹΪ5V�����Գ��~~");
		}else if(iVoltag5V.output5V()>5) {
			System.out.println("��ѹ����5V,�����Գ��~~");
		}
	}
}
