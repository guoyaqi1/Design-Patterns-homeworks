package composite;

public class Client {

	public static void main(String[] args) {
		// 从大到小创建对象 学校
		OrganizationComponent university=new University("清华大学","中国顶级大学");
		
		//创建 学院
		OrganizationComponent college1=new College("计算机学院","计算机学院");
		OrganizationComponent college2=new College("电子信息学院","电子信息学院");
		OrganizationComponent college3=new College("外国语学院","外国语学院");
		
		//创建各个学院下面的系(专业)
		college1.add(new Department("软件工程","软件工程不错"));
		college1.add(new Department("网络工程","网络工程不错"));
		college1.add(new Department("计算机科学与技术","计算机科学与技术不错"));
		
		//
		college2.add(new Department("通信工程","通信工程不错"));
		college2.add(new Department("信息工程","信息工程不错"));
		
		//将学院加入到学校
		university.add(college1);
		university.add(college2);
		
		university.print();
		

	}

}
