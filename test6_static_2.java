package project9;

public class test6_static_2 {

	public static void main(String[] args) {
		new B();  //ʵ������ʱ�����������ֽ���

		new B();
		
		new B();
	}
	
	

}

class B{
	static int x;
	//��̬����
	static void show() {
		System.out.println("���Ǿ�̬������");
	}
	
	//��̬�顷����һ��new��ʱ��ᱻ����һ��
	static {
		System.out.println("���Ǿ�̬�顣");
	}
	
	//ʵ���顷��ÿ�ι��췽��ǰ����һ��
	{
		System.out.println("ʵ����");
	}
	
	//���췽������newһ�ξ͵���һ��
	public B(){
		System.out.println("���췽��");
	}
	
	public void show2() {
		System.out.println("��ͨ����");
	}
}