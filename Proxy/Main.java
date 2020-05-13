package designpattern.Structural_Pattern.Proxy;

import designpattern.Structural_Pattern.Proxy.Dynamic.CLocalPicShowProxy;
import designpattern.Structural_Pattern.Proxy.Static.CLocalPicShow;

/*
 * 代理模式:用一个代理类升级被代理类的某些方法
 * AOP编程...
 * 
 * 和适配器模式很像
 * */
public class Main {
		public static void main(String[] args) {
			// staticProxy();
			CLocalPicShowProxy cpsProxy =new CLocalPicShowProxy(new CRemopic());
			IShowPic pic = (IShowPic)cpsProxy.getProxyInstance();
			pic.showPic("大脑斧");
		}

		private static void staticProxy() {
			IShowPic proxy = new CLocalPicShow();
			proxy.showPic("小脑斧");
		}
}
