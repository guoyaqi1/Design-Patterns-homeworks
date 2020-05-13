package designpattern.BehavioralPattern.Mediator;

import java.util.Hashtable;

public class ChatGroup extends AbstractChatroom{
	
	Hashtable<String, Member> members = new Hashtable<String, Member>();
	

	@Override
	public void register(Member member) {
		members.put(member.getName(), member);
		member.setCharRoom(this);
	}

	@Override
	public void sendText(String from, String to, String message) {
		Member toM = members.get(to);
		message = message.replace("打", "***");
		toM.receiveText(members.get(from), message);
	}

	@Override
	public void sengImage(String from, String to, String image) {
		Member toM = members.get(to);
		if(image.length()>5) {
			System.out.println("图片太大无法发送");
		}else {
			toM.receiveImage(members.get(from), image);
		}
	}

}
