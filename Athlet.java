package project8_oop;

import java.util.Random;

//�˶�Ա
public class Athlet {
	private String name;
	private double  weight;
	
	//���췽��������Գ�ʼ��
	//���췽���������ص�
	//1������ͬ��  2���޷���ֵ������ void ��  3�� new���� ʱ����
	public Athlet(String n,double w) {
		//Ҳ���Լ��߼�
		if(n==null||n.length()<2) {
			name="δ֪�˶�Ա";
		}else {
			name=n;
		}
		if(w<40||w>300) {
			System.out.println("���������쳣��");
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
			name="δ֪�˶�Ա";
		}else {
			name=n;
		}
	}
	
	public void setWeight(double w) {
		if(w<40||w>300) {
			System.out.println("���������쳣");
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
