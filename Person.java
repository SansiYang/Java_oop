package project9;

/*
 
 дһ����Person�������������ԣ�
 String name;
 int age;
 boolean gender;
 Person partner;
 ΪPerson��дһ��marry(Person p)����
 
  */

public class Person {
	private String name;
	private int age;
	private boolean gender;
	private Person partner;
	
	//���
	public boolean divorce(Person p) {
		if(this.partner!=p||p.partner!=this) {
			System.out.println(this.name+"��"+p.name+"���Ƿ��ޣ�������飡");
			return false;
		}
		this.partner=null;
		p.partner=null;
		System.out.println(this.name+"��"+p.name+"���ɹ���");
		return true;
	}
	
	
	//���
	public boolean marry(Person p) {
		if(this.gender==p.gender) {
			System.out.println("ͬ�Բ��ܽ�飬���ǵ��Ա���"+(this.gender==true?"Ů":"��"));
			return false;
		}
		if(this.partner!=null) {
			System.out.println(this.name+"���ѽ�飬�����ػ�!");
			return false;
		}
		if(p.partner!=null) {
			System.out.println(p.name+"���ѽ�飬�����ػ�!");
			return false;
		}
		if(this.gender==true&&this.age<24||this.gender==false&&this.age<22) {
			System.out.println(this.name+"δ�������ɻ����䣬���ܽ�飬���ɹ涨����>24��Ů>22 ���ܽ�顣");
			return false;
		}
		if(p.gender==true&&p.age<24||p.gender==false&&p.age<22) {
			System.out.println(p.name+"δ�������ɻ����䣬���ܽ�飬���ɹ涨����>24��Ů>22 ���ܽ�顣");
			return false;
		}
		if(this==p) {
			System.out.println("�������Լ���飡");
			return false;
		}
		this.partner=p;
		p.partner=this;
		System.out.println(this.name+"��"+p.name+"���ɹ���");
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
