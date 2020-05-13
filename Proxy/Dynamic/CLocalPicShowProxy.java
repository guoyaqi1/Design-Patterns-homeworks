package designpattern.Structural_Pattern.Proxy.Dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
 * 动态代理:利用java反射机制，可以在实现的时候无需写明代理的接口。
 * 
 * 和静态代理区别:会将被包装类的所有方法全部代理。
 * 				不需要接口，因此可以给所有类型的对象进行代理
 * 
 * 实现细节:1、继承InvacationHandler接口
 * 			2、实现getProxyInstance和invoke两个方法。
 * */

public class CLocalPicShowProxy implements InvocationHandler{
	private Object target;			// 被代理的目标
	
	public CLocalPicShowProxy(Object t) {
		target = t;
	}
	
	public Object getProxyInstance() {		// 返回代理目标的一个代理类
		return Proxy.newProxyInstance(target.getClass().getClassLoader(),
				target.getClass().getInterfaces(), 
				this);
				
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {	// 给所有方法的包装。
		System.out.println("准备载入图片...");
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					method.invoke(target, args);
					System.out.println("图片加载完成");
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		});
		th.start();
		return null;
	}
}
