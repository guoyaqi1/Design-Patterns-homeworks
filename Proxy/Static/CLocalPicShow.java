package designpattern.Structural_Pattern.Proxy.Static;

import designpattern.Structural_Pattern.Proxy.CRemopic;
import designpattern.Structural_Pattern.Proxy.IShowPic;

/*
 * 静态代理:和适配器模式比起来，没有新的接口，只是用一个代理类把旧功能给包装起来了，添加了部分功能
 * 		   和装饰模式比起来，没有包装的太复杂，简单的包装了一下。
 * 		  代理类和被代理的类，对于用户来说就是一个类（透明的），用户发现不了这是一个代理。
 * */

public class CLocalPicShow implements IShowPic, Runnable {

	private IShowPic pic;
	private String picname;
	
	@Override
	public void run() {					// 后台慢慢加载图片
		pic.showPic(picname);
		System.out.println("图片加载完成");	 	// 图片变成了高清大图
	}

	@Override
	public void showPic(String picname) {
			pic = new CRemopic();
			this.picname = picname;
			System.out.println("准备载入图片....");		// 此时你的电脑上应该有一张缩略图
			
			// pic.showPic			后台偷偷摸摸浪费你流量
			Thread th = new Thread(this);
			th.start();
		
	}

}
