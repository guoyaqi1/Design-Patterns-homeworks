package designpattern.Structural_Pattern.Proxy;

// 需要被代理的类

public class CRemopic implements IShowPic{

	@Override
	public void showPic(String picname) {
		for(int i =0;i<3;i++) {
			System.out.println(picname+"图片加载中"+(i+1));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
