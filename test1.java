package project9;

public class test1 {

	public static void main(String[] args) {
		//方法重载的测试
		//在同一个类中有多个方法定义
		//1.名字相同
		//2.但是形参不同(个数 ，类型，顺序)
		
		
		//求两个数的最大值
		int a=max(1,2);
		System.out.println(a);
		
		double b=max(1.2,1.34);
		System.out.println(b);
		
		//一个int型一个double型
		double c=max(12,1.2);
		System.out.println(c);  //用的是duble型的函数，int型隐式转换为double型
		
		//println是最典型的重载，什么类型的数据都可以输出
		
		int []x=new int[] {1,2,3};
		System.out.println(max(x));
		
		System.out.println(max(1.2f,2));//加 f 表示当前的 1.2 是一个float类型，所以匹配方法 max(float x,int y);
		System.out.println(max(1,2.1f));//加 f 表示当前的 2.1 是一个float类型，所以匹配方法 max(int x,float y);

	}
	
	public static double max(int x,float y) {
		System.out.print("你调用的是"+"int x,float y");
		return x>y?x:y;
	}
	public static double max(float x,int y) {
		return x>y?x:y;
	}
	
	//方法定义：  权限  返回值类型  方法名（形参列表）
	public static int max(int x,int y) {
		return x>y?x:y;
	}
	
	public static double max(double x,double y) {
		return x>y?x:y;
	}
	
	public static int max(int[]arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
