package bridge;

public class UpRightPhone extends Phone{

	
	public UpRightPhone(Brand brand) {
		super(brand);
	}
	public void open() {
		super.open();
		System.out.println("全面屏样式手机");
	}

	public void close() {
		super.close();
		System.out.println("全面屏样式手机");
	}
	public void call() {
		super.call();
		System.out.println("全面屏样式手机");
	}
}
