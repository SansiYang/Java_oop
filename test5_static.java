package project9;

//��̬��Ա��������࣬���еĶ�����Է���
//�Ǿ�̬������Ķ���

public class test5_static {
	public static void main(String []args) {
		A a=new A();
		A b=new A();
		System.out.println(a.x);
		System.out.println(a.y);
		System.out.println("��̬"+A.x);
		System.out.println("�Ǿ�̬"+a.y);
	}
	
	

}

class A{
	//��̬��Ա����
	static int x;   //��̬��Ա���������࣬��        ����.��Ա��
	int y;  		//�Ǿ�̬��Ա���ԣ����ڶ�����  ������.��Ա��
	public A() {
		x++;
		y++;
	}
}
