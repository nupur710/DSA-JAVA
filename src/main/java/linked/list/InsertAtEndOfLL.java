package linked.list;

public class InsertAtEndOfLL {
	
	public static Node insertEnd(Node head, int x) {
		Node temp= new Node(x);
		if(head == null) {
			return temp;
		}
		Node curr= head;
		while(curr.next != null) 
		  curr= curr.next;
		curr.next= temp;
		print(head);
		return head;
	}
	
	public static void print(Node node) {
		Node curr= node;
		while(curr!=null) {
			System.out.println(curr.data);
		}
		curr= curr.next;
	}
	
	public static void main(String[] args) {
		Node head = null;
		head= insertEnd(head, 10);
		head= insertEnd(head, 20);
		head= insertEnd(head, 30);
	}

}
