package designpattern.BehavioralPattern.Mediator;
/*
 * 
 * 中介者模式:封装一系列对象的交互关系，使得个对象不必显示相互应用。
 * 
 * 对象之间的通信必须要经过中介者来实现。
 * 可以将对象之间的通信过滤
 * 
 *实现:
 *Mediator:抽象中介者:
 *			用于定义统一的接口，用于各同事对象之间的交互
 *ConcreteMediator:具体中介者:
 *			具体中介者持有各同事对象的引用，负责协调各同事对象的行为以完成协作
 *Colleague 同事角色
 * */

public class Main {
	public static void main(String[] args) {
		AbstractChatroom happyChar = new ChatGroup();
		Member [] members = new Member[5];
		members[0] = new DiamonMember("张三");
		members[1] = new DiamonMember("李四");
		members[2] = new CommonMember("王五");
		members[3] = new CommonMember("赵六");
		members[4] = new CommonMember("小红");
		for (Member member : members) {
			happyChar.register(member);
		}
		
		members[0].sendText("小红","今天天气真好");
		members[1].sendText("张三", "我要打死你");
		members[0].sendImage("赵六", "小红花");
		members[2].sendText("小红", "大大的太阳");
		members[3].sendImage("小红", "爱心");
	}
}
