package project9;

public class test_stack {

	public static void main(String[] args) {
		YcStack stack=new YcStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//System.out.println(stack.pop());
		System.out.println(stack.peek());
	}

}
