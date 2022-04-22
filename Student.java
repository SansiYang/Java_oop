package project7_oop;

//实体类：用来表示一个 类型
//学生类型
//java的文件名格式要与 public 修饰的类名一样
//可以写多个类  但是不能是 public 修饰
//java最基本的运行的单位就是类

public class Student {
	String name;
	int id;
	int age;
	String sex;
	
	public void happyBirsthday() {
		System.out.println(name+"过生日啦！");
		age++;
	}

}
