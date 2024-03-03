package linked.list;

public class RecursivelyPrintLL {
	
	public static void main(String[] args) {
		Node n1= new Node(10);
		n1.next= new Node(20);
		n1.next.next= new Node(30);
		n1.next.next.next= new Node(40);
		n1.next.next.next.next= new Node(50);
		rPrint(n1);
	}
	
	public static void rPrint(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		rPrint(node.next);
	}
}
