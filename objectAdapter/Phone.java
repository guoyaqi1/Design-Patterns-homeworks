package objectAdapter;

public class Phone {
//充电的方法
	public void charging(IVoltag5V iVoltag5V) {
		if(iVoltag5V.output5V()==5) {
			System.out.println("电压为5V，可以充电~~");
		}else if(iVoltag5V.output5V()>5) {
			System.out.println("电压大于5V,不可以充电~~");
		}
	}
}
