package linked.list;

public class InsertAtEndOfDLL {
	
	public static DoubleNode insertAtEnd(DoubleNode head, int x) {
		if(head == null) {
			return new DoubleNode(x);
		}
		DoubleNode temp= new DoubleNode(x);
		DoubleNode curr= head;
		while(curr.next != null) {
			curr= curr.next;
		}
		curr.next= temp;
		temp.prev= curr;
		return head;
	}

	public static void main(String[] args) {
		DoubleNode h= null;
		h= insertAtEnd(h, 20);
		h= insertAtEnd(h, 30);
		h= insertAtEnd(h, 40);
		h= insertAtEnd(h, 50);
		print(h);

	}
	
	public static void print(DoubleNode node) {
		while(node != null) {
			System.out.println(node.data);
			node= node.next;
		}
	}

}
