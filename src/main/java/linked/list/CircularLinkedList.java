package linked.list;

public class CircularLinkedList {

	public static void main(String[] args) {
		
		Node head= new Node(10);
		head.next= new Node(5);
		head.next.next= new Node(15);
		head.next.next.next= new Node(20);
		head.next.next.next.next= head;
		
		print(head);
	}
	
	public static void print(Node node) {
		while(node != null) {
			System.out.println(node.data);
			node= node.next;
		}
	}

}
