package stack;

import java.util.ArrayList;

public class MyStackArrayList {
	
	ArrayList<Integer> al= new ArrayList<Integer>();
	
	void push(int x) throws Exception {
		al.add(x);
	}
	
	int pop() throws Exception {
		int res= al.get(al.size() -1);
		al.remove(al.size()-1);
		return res;
	}
	
	int size() {
		return al.size();
	}
	
	boolean isEmpty() {
		return (al.size() == -1);
	}
}
