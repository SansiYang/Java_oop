package project8_oop;

public class test3 {

	public static void main(String[] args) {
		Student a=new Student("��ŷ");
		a.addQuiz(60);
		a.addQuiz(75);
		a.addQuiz(96);
		
		System.out.println(a.getname()+"�ܷ�Ϊ��"+a.getTotalScore()+"ƽ���ɼ�Ϊ��"+a.getAverageScore());

	}

}
