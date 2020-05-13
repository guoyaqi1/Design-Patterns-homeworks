package designpattern.BehavioralPattern.Mediator;

public abstract class Member {
	String name;
	AbstractChatroom charRoom;
	
	

	public Member(String name) {
		super();
		this.name = name;
	}

	public void receiveText(Member from,String message) {
		System.out.println("收到来自"+from.getName()+"的消息:"+message);
	}
	
	public void receiveImage(Member from,String image) {
		System.out.println("收到来自"+from.getName()+"的图片:"+image);
	}
	
	public abstract void sendText(String to,String message);
	public abstract void sendImage(String to,String image);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AbstractChatroom getCharRoom() {
		return charRoom;
	}

	public void setCharRoom(AbstractChatroom charRoom) {
		this.charRoom = charRoom;
	}
	
	
}
