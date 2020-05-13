package designpattern.BehavioralPattern.Iterator;

public class SkyworthTelevision implements Television{
	
	private Object[] obj= {"CCTV-1","CCTV-2","CCTV-3","CCTV-4","CCTV-5"};

	@Override
	public TVIterator createIterator() {
		return new SkyworthIterator();
	}
	

	public class SkyworthIterator implements TVIterator{
		private int currentIndex = 0;
		@Override
		public void setChannel(int i) {
			currentIndex = i;
		}

		@Override
		public Object CurrentChannel() {
			if(currentIndex>obj.length||currentIndex<0)
				return null;
			else return obj[currentIndex];
		}

		@Override
		public void next() {
			currentIndex++;
		}

		@Override
		public void previous() {
			currentIndex--;
		}

		@Override
		public boolean isLast() {
			if(currentIndex == (obj.length-1)) return true;
			return false;
		}

		@Override
		public boolean isFirst() {
			if(currentIndex == 0) return true;
			return false;
		}
	}

}
