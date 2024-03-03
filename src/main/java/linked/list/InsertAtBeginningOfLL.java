package linked.list;

public class InsertAtBeginningOfLL {
	
	public static void main(String[] args) {
//		Node n1= new Node(10);
//		n1.next= new Node(20);
//		n1.next.next= new Node(30);
//		n1.next.next.next= new Node(40);
//		insertBegin(5, n1);
		
		Node n1= null;
		n1= insertBegin(5, n1);
		n1= insertBegin(10, n1);
		n1= insertBegin(20, n1);
		n1= insertBegin(30, n1);
	}
	
	public static Node insertBegin(int x, Node head) {
		Node temp= new Node(x);
		temp.next= head;
		print(temp);
		return temp;
	}
	
	public static void print(Node node) {
		while(node != null) {
			System.out.println(node.data);
			node= node.next;
		}
	}
	

}
