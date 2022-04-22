package project7_oop;

public class Person {
	
	String name;
	double weight;//公斤
	double height;//米

	String bmi() {
		double bmi=weight/(height*height);
		if(bmi<24) {
			return name+"过轻";
		}else if(bmi<=26){
			return name+"标准身材";
		}else {
			return name+"肥胖";
		}
	}
}
