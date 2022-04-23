package project8_oop;

public class Calculator {

	public int x;
	public int y;
	
	public int add() {
		return x+y;
	}
	
	public int sub() {
		return x-y;
	}
	
	public int multiply() {
		return x*y;
	}
	
	public int divid() {
		if(x==0) {
			System.out.println("除数不能为0!");
			return 0;
		}else {
			return x/y;
		}
	}
	
	public int mode() {
		if(x==0) {
			System.out.println("除数不能为0!");
			return 0;
		}else {
			return x%y;
		}
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
