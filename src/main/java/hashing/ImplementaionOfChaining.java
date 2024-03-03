package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementaionOfChaining {
	
	static int bucket;
	static ArrayList<LinkedList<Integer>> table;
	
	public ImplementaionOfChaining(int b) {
		bucket= b;
		table= new ArrayList<LinkedList<Integer>>();
		for (int i= 0; i< b; i++) {
			table.add(new LinkedList<Integer>());
		}
	}
	
	static void insert(int key) {
		int i= key % bucket;
		
		table.get(i).add(key);
		
	}
	
	static void remove(int key) {
		int i= key % bucket;
		table.get(i).remove(key);
	}
	
	static boolean search(int key) {
		int i= key % bucket;
		return table.get(i).contains(key);
	}
	
	public static void main(String[] args) {
		ImplementaionOfChaining chain= new ImplementaionOfChaining(7);
		insert(50);
		insert(15);
		insert(21);
		insert(58);
		insert(17);
		insert(49);
		insert(56);
		
		System.out.println(search(49));
		
		remove(49);
		
		System.out.println(search(49));
		
	}
	
	
	
	

}
