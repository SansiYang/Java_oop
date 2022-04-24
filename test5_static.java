package project9;

//静态成员属于这个类，所有的对象可以访问
//非静态属于类的对象

public class test5_static {
	public static void main(String []args) {
		A a=new A();
		A b=new A();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println("静态"+A.x);
		System.out.println("非静态"+a.y);
	}
	
	

}

class A{
	//静态成员属性
	static int x;   //静态成员属性属于类，用        类名.成员名
	int y;  		//非静态成员属性，属于对象，用  对象名.成员名
	public A() {
		x++;
		y++;
	}
}
