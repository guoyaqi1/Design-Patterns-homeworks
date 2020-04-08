package objectAdapter;
//被适配的类
public class Voltag220V {
	public int output220V() {
		//输出220V的电压，不变
		int src=220;
		System.out.println("电压="+src+"伏特");
		return src;
		
	}

}
