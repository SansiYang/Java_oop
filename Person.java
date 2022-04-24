package project9;

/*
 
 写一个类Person，包含以下属性：
 String name;
 int age;
 boolean gender;
 Person partner;
 为Person类写一个marry(Person p)方法
 
  */

public class Person {
	private String name;
	private int age;
	private boolean gender;
	private Person partner;
	
	//离婚
	public boolean divorce(Person p) {
		if(this.partner!=p||p.partner!=this) {
			System.out.println(this.name+"与"+p.name+"不是夫妻，不能离婚！");
			return false;
		}
		this.partner=null;
		p.partner=null;
		System.out.println(this.name+"与"+p.name+"离婚成功！");
		return true;
	}
	
	
	//结婚
	public boolean marry(Person p) {
		if(this.gender==p.gender) {
			System.out.println("同性不能结婚，你们的性别都是"+(this.gender==true?"女":"男"));
			return false;
		}
		if(this.partner!=null) {
			System.out.println(this.name+"你已结婚，不能重婚!");
			return false;
		}
		if(p.partner!=null) {
			System.out.println(p.name+"你已结婚，不能重婚!");
			return false;
		}
		if(this.gender==true&&this.age<24||this.gender==false&&this.age<22) {
			System.out.println(this.name+"未到法定成婚年龄，不能结婚，法律规定：男>24，女>22 才能结婚。");
			return false;
		}
		if(p.gender==true&&p.age<24||p.gender==false&&p.age<22) {
			System.out.println(p.name+"未到法定成婚年龄，不能结婚，法律规定：男>24，女>22 才能结婚。");
			return false;
		}
		if(this==p) {
			System.out.println("不能与自己结婚！");
			return false;
		}
		this.partner=p;
		p.partner=this;
		System.out.println(this.name+"与"+p.name+"结婚成功！");
		return true;
		
		
	}
	
	public Person(String name, int age, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.partner = partner;
	}

	public Person() {
		super();
	}
	
	
	

}
