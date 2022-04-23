package project8_oop;

import java.util.Random;

//运动员
public class Athlet {
	private String name;
	private double  weight;
	
	//构造方法完成属性初始化
	//构造方法有以下特点
	//1、与类同名  2、无返回值（不用 void ）  3、 new对象 时调用
	public Athlet(String n,double w) {
		//也可以加逻辑
		if(n==null||n.length()<2) {
			name="未知运动员";
		}else {
			name=n;
		}
		if(w<40||w>300) {
			System.out.println("体重数据异常！");
			System.exit(0);
		}else {
			weight=w;
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String n) {
		if(n==null||n.length()<2) {
			name="未知运动员";
		}else {
			name=n;
		}
	}
	
	public void setWeight(double w) {
		if(w<40||w>300) {
			System.out.println("体重数据异常");
			System.exit(0);
		}else {
			weight=w;
		}
	}
	
	public void excise() {
		Random r=new Random();
		int a=r.nextInt(3);
		weight=weight-a;
	}

}
