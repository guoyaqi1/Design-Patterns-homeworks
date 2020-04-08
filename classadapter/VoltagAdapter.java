package classadapter;
//适配器类
public class VoltagAdapter extends Voltag220V implements IVoltag5V{

	@Override
	public int output5V() {
		// 获取到220V的电压
		int src=output220V();
		int dstV=src/44;//转成5V
		return dstV;
	}
	

}
