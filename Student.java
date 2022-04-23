package project8_oop;

public class Student {
	
	private String name;
	private int totalScore;
	
	private int num;  //考试次数
	
	//对姓名完成初始化
	public Student(String n) {
		name=n;
	}
	
	//获取姓名
	public String getname() {
		return name; 
	}
	
	
	//输入小测验成绩的方法
	public void addQuiz(int score) {
		//累加成绩
		totalScore+=score;
		num++;
	}
	
	//获取总成绩
	public int getTotalScore() {
		return totalScore;
	}
	
	//获取平均成绩的方法
	public int getAverageScore() {
		if(num==0) {
			System.out.println(name+"没有参加过考试！");
			return 0;
		}
		return totalScore/num;
	}

}
