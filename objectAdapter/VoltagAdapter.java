package objectAdapter;
//适配器类
public class VoltagAdapter  implements IVoltag5V{

	private Voltag220V voltag220V;//关联关系——聚合关系
	
	/**
	 * 通过构造器传入一个Voltag220V实例
	 */
	public VoltagAdapter(Voltag220V voltag220v) {
		
		this.voltag220V = voltag220v;
	}

	@Override
	public int output5V() {
		int dst=0;
		if(null!=voltag220V) {
			int src=voltag220V.output220V();//获取220V电压
			System.out.println("使用对象适配器，进行适配~~");
			dst=src/44;
			System.out.println("适配完成，输出的电压="+dst);
		}
		return dst;
	}
	

}
