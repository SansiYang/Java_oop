package project9;

public class test4_person_marry {

	public static void main(String[] args) {
		Person p1=new Person("小红",24,false);
		Person p2=new Person("小蓝",24,true);
		Person p3=new Person("张三",24,true);
		Person p4=new Person("孙红燕",24,false);
		Person p5=new Person("李子豪",24,true);
		Person p6=new Person("彭戴",24,false);
		
		p1.marry(p6);
		p1.marry(p2);
		p1.divorce(p6);
		p1.divorce(p2);

	}

}
