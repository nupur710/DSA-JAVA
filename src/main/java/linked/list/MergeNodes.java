package linked.list;

public class MergeNodes {
	
	public static void merge(Node head) {
		Node temp= null;
		int sum= 0;
		Node curr= head;
		while(curr.data != 0) {
			sum+= curr.data;
			curr= curr.next;
		//	System.out.println(curr.data);

		}
		System.out.println(sum);
		curr= head.next;
	}
	
	public static void main(String[] args) {
		
		Node n= new Node(8);
		n.next= new Node(1);
		n.next.next= new Node(2);
		n.next.next.next= new Node(0);
		merge(n);
	}

}
