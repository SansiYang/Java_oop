package project8_oop;

//ʵ���ࣺ���ڰ�װ����
public class Account {
	private String uname;
	private String password;  //private ��ʾ˽��  ֻ����������������
	
	
	//������˽��ʱ�������ṩ  ��������  ������
	//�ṩһ����������ķ���������������У����Լ��߼������ȡ��ܼ����������ģ�
	public void setPassword(String p) {
		//�߼����룺�ж� p �ĳ������С��6���Զ��趨һ����ʼ����
		if(p.length()<6) {
			System.out.println("���볤�ȹ��̣��������6λ���粻���㣬ϵͳ�Զ��������룺123456");
			password="123456";
		}else {
			password=p;
		}
	}
	
	//�û����������λ  �ո���
	public void setUname(String u) {
		//trim������ʾ��һ���ַ���ȥ���ո�
		if(u==null||u.trim().length()<2) {
			System.out.println("�û�����������ϵͳ��ȫ�˳���");
			System.exit(0);
		}else {
			uname=u;
		}
	}
	
	public boolean login(String u,String pwd) {
		//equals()�ж������ַ����Ƿ����
		
		if(uname.equals(u)&&password.equals(pwd)) {
			return true;
		}else {
			return false;
		}
	}

}
