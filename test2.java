package project8_oop;

public class test2 {

	public static void main(String[] args) {
		Athlet a=new Athlet("µÏåÈ",45);
		//a.setName("Ì©ÂÞ");
		//a.setWeight(43.3);
		
		a.excise();
		System.out.println(a.getName()+"\t"+a.getWeight() );
		a.excise();
		System.out.println(a.getName()+"\t"+a.getWeight() );
	}

}
