package project7_oop;

public class test1 {

	public static void main(String[] args) {
		//java�е���Ҫʵ����������
		Student s=new Student();
		s.id=1;
		s.name="���罣��";
		s.age=21;
		s.sex="��";
		Student a=new Student();
		a.id=2;
		a.name="�����ͽ";
		a.age=34;
		a.sex="��";
		
		System.out.println(s.id+"\t"+s.name+"\t"+s.age+"\t"+s.sex);
		System.out.println(a.id+"\t"+a.name+"\t"+a.age+"\t"+a.sex);
		
		s.happyBirsthday();
		
		System.out.println(s.id+"\t"+s.name+"\t"+s.age+"\t"+s.sex);

	}

}
