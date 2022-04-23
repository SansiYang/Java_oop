package project8_oop;

public class test3 {

	public static void main(String[] args) {
		Student a=new Student("雷欧");
		a.addQuiz(60);
		a.addQuiz(75);
		a.addQuiz(96);
		
		System.out.println(a.getname()+"总分为："+a.getTotalScore()+"平均成绩为："+a.getAverageScore());

	}

}
