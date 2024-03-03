package linked.list;

public class InsertAtBeginOfDLL {
	
	public static DoubleNode insertBegin(DoubleNode head, int x) {
		DoubleNode temp= new DoubleNode(x);
		temp.next= head;
		if(head!=null) {
			head.prev= temp;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		DoubleNode h= new DoubleNode(5);
		h= insertBegin(h, 10);
		h= insertBegin(h, 20);
		h= insertBegin(h, 6);
		//print(h);   //		QUERY: WHY DOES THIS NOT DISPLAY 5??
	}
	
	public static void print(DoubleNode head) {
		while(head.next!= null) {
			System.out.println(head.data);
			head= head.next;
		}
	}
	
	
}
