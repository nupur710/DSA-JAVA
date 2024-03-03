package linked.list;

public class InsertAtBeginOfCLL {
	//Naive solution
//	public static Node insertAtBegin(Node head, int x) {
//		Node temp= new Node(x);
//		Node curr= head;
//		while(curr.next != head) {
//			curr= curr.next;
//		}
//		curr.next= temp;
//		temp.next= head;
//		return temp;
//	}
	
	//Efficient solution
	public static Node insertAtBegin(Node head, int x) {
		Node temp= new Node(x);
		if(head == null) {
			temp.next= temp;
		}
		temp.next= head.next;
		head.next= temp;
		int t= head.data;
		head.data= temp.data;
		temp.data= t;
		return head;
	}

	public static void print(Node head) {
		Node stop= head;
		Node curr= head;
		while(curr.next != head) {
			System.out.println(curr.data);
			curr= curr.next;
		}
		System.out.println(curr.data); //we need to separately handle this case because when curr.next= head, loop terminates and does not print the value of last node
	}
	
	public static void main(String[] args) {
		Node head= new Node(10);
		head.next= new Node(5);
		head.next.next= new Node(15);
		head.next.next.next= new Node(20);
		head.next.next.next.next= head;
		insertAtBegin(head, 40);
		print(head);
	}
}
