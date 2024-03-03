package stack;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		MyStackArray stack= new MyStackArray(3);
		stack.pop();
		stack.push(12);
		stack.push(4);
		System.out.println(stack.pop());
		
		

	}

}
