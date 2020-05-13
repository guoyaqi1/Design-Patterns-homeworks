package designpattern.BehavioralPattern.Mediator;

public class CommonMember extends Member{

	public CommonMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		getCharRoom().sendText(getName(), to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		System.out.println("普通会员无法发送图片");
	}

}
