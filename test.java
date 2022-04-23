package project8_oop;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// 创建账户，设定用户名和密码
		Account a=new Account();
		a.setUname("aa");
		a.setPassword("a111");
		
		//输入登录用户和密码
		System.out.println("系统启动。。。");
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入用户名：");
		System.out.println();
		String yonghuming=sc.nextLine();
		System.out.print("请输入密码：");
		System.out.println();
		String mima=sc.nextLine();
		
		boolean result=a.login(yonghuming, mima);
		if(result==false) {
			System.out.println("登录失败，用户名或密码输入错误！");
		}else {
			System.out.println("欢迎您："+yonghuming);
		}
	}

}
