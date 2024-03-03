package linked.list;

public class NodeTest2 {

	public static void main(String[] args) {
		
		Node head= new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		
		printList(head);

	}
	
	static public void printList(Node node) {
		//Node curr= node;
		while(node != null) {
			System.out.println(node.data);
			node= node.next;
		}
	}

}
