package linked.list;

public class LengthOfLL {
	
	public static int getCount(Node head) {
		Node curr= head;
		int count= 1;
		while(curr.next != null) {
			count++;
			curr= curr.next;
		}
		return count;
	}
	
	public static Node insertBegin(int x, Node head) {
		Node temp= new Node(x);
		temp.next= head;
		return temp;
	}
	
	public static void main(String[] args) {
		Node n1= null;
		n1= insertBegin(5, n1);
		n1= insertBegin(10, n1);
		n1= insertBegin(20, n1);
		n1= insertBegin(30, n1);
		System.out.println(getCount(n1));
	}

}
