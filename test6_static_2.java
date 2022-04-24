package project9;

public class test6_static_2 {

	public static void main(String[] args) {
		new B();  //实例化类时，会加载类的字节码

		new B();
		
		new B();
	}
	
	

}

class B{
	static int x;
	//静态方法
	static void show() {
		System.out.println("我是静态方法。");
	}
	
	//静态块》》第一次new的时候会被调用一次
	static {
		System.out.println("我是静态块。");
	}
	
	//实例块》》每次构造方法前调用一次
	{
		System.out.println("实例块");
	}
	
	//构造方法》》new一次就调用一次
	public B(){
		System.out.println("构造方法");
	}
	
	public void show2() {
		System.out.println("普通方法");
	}
}