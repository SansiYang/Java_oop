package project8_oop;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// �����˻����趨�û���������
		Account a=new Account();
		a.setUname("aa");
		a.setPassword("a111");
		
		//�����¼�û�������
		System.out.println("ϵͳ����������");
		Scanner sc=new Scanner(System.in);
		System.out.print("�������û�����");
		System.out.println();
		String yonghuming=sc.nextLine();
		System.out.print("���������룺");
		System.out.println();
		String mima=sc.nextLine();
		
		boolean result=a.login(yonghuming, mima);
		if(result==false) {
			System.out.println("��¼ʧ�ܣ��û����������������");
		}else {
			System.out.println("��ӭ����"+yonghuming);
		}
	}

}
