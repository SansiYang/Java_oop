package project7_oop;

public class test1 {

	public static void main(String[] args) {
		//java中的类要实例化才能用
		Student s=new Student();
		s.id=1;
		s.name="疾风剑豪";
		s.age=21;
		s.sex="男";
		Student a=new Student();
		a.id=2;
		a.name="法外狂徒";
		a.age=34;
		a.sex="男";
		
		System.out.println(s.id+"\t"+s.name+"\t"+s.age+"\t"+s.sex);
		System.out.println(a.id+"\t"+a.name+"\t"+a.age+"\t"+a.sex);
		
		s.happyBirsthday();
		
		System.out.println(s.id+"\t"+s.name+"\t"+s.age+"\t"+s.sex);

	}

}
