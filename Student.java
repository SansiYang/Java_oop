package project8_oop;

public class Student {
	
	private String name;
	private int totalScore;
	
	private int num;  //���Դ���
	
	//��������ɳ�ʼ��
	public Student(String n) {
		name=n;
	}
	
	//��ȡ����
	public String getname() {
		return name; 
	}
	
	
	//����С����ɼ��ķ���
	public void addQuiz(int score) {
		//�ۼӳɼ�
		totalScore+=score;
		num++;
	}
	
	//��ȡ�ܳɼ�
	public int getTotalScore() {
		return totalScore;
	}
	
	//��ȡƽ���ɼ��ķ���
	public int getAverageScore() {
		if(num==0) {
			System.out.println(name+"û�вμӹ����ԣ�");
			return 0;
		}
		return totalScore/num;
	}

}
