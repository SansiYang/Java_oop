package project7_oop;

public class Person {
	
	String name;
	double weight;//����
	double height;//��

	String bmi() {
		double bmi=weight/(height*height);
		if(bmi<24) {
			return name+"����";
		}else if(bmi<=26){
			return name+"��׼���";
		}else {
			return name+"����";
		}
	}
}
