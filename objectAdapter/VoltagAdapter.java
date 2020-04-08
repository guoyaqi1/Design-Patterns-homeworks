package objectAdapter;
//��������
public class VoltagAdapter  implements IVoltag5V{

	private Voltag220V voltag220V;//������ϵ�����ۺϹ�ϵ
	
	/**
	 * ͨ������������һ��Voltag220Vʵ��
	 */
	public VoltagAdapter(Voltag220V voltag220v) {
		
		this.voltag220V = voltag220v;
	}

	@Override
	public int output5V() {
		int dst=0;
		if(null!=voltag220V) {
			int src=voltag220V.output220V();//��ȡ220V��ѹ
			System.out.println("ʹ�ö�������������������~~");
			dst=src/44;
			System.out.println("������ɣ�����ĵ�ѹ="+dst);
		}
		return dst;
	}
	

}
