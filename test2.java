package project7_oop;

import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		Random r=new Random();
		
		for(int i=0;i<10;i++) {
			Person p=new Person();
			p.name="¾ÅÎ²Ñýºü"+i;
			p.height=1.65;
			p.weight=r.nextInt(30)+50;
			
			String str=p.bmi();
			System.out.println(str);
		}
		
		
	}

}
