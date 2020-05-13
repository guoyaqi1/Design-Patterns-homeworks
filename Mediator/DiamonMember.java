package designpattern.BehavioralPattern.Mediator;

public class DiamonMember extends Member{
	

	public DiamonMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		getCharRoom().sendText(getName(), to, message);
	}

	@Override
	public void sendImage(String to, String image) {
		getCharRoom().sengImage(getName(), to, image);
	}

}
