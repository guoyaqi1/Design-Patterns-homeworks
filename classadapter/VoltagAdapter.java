package classadapter;
//��������
public class VoltagAdapter extends Voltag220V implements IVoltag5V{

	@Override
	public int output5V() {
		// ��ȡ��220V�ĵ�ѹ
		int src=output220V();
		int dstV=src/44;//ת��5V
		return dstV;
	}
	

}
