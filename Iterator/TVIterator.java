package designpattern.BehavioralPattern.Iterator;

public interface TVIterator {
	public void setChannel(int i);
	public Object CurrentChannel();
	public void next();
	public void previous();
	public boolean isLast();
	public boolean isFirst();
}
