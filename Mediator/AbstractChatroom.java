package designpattern.BehavioralPattern.Mediator;

public abstract class AbstractChatroom {
	public abstract void register(Member member);
	public abstract void sendText(String from,String to,String message);
	public abstract void sengImage(String from,String to,String image);
}
