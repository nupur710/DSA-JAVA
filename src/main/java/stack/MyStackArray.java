package stack;

public class MyStackArray {
	
	int arr[];
	int cap;
	int top;
	
	public MyStackArray(int c) {
		arr= new int[c];
		cap= c;
		top= -1;
	}
	
	void push(int x) throws Exception {
		if(top == cap - 1) {
			throw new Exception("Overflow");
		}
		top++;
		arr[top]= x;
	}
	
	int pop() throws Exception {
		if(top == -1) {
			throw new Exception("Underflow");
		}
		int res= arr[top];
		top--;
		return res;
	}
	
	int size() {
		return top+1;
	}
	
	boolean isEmpty() {
		return (top == -1);
	}

}
