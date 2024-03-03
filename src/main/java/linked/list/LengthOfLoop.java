package linked.list;

public class LengthOfLoop {
	
    static void countNodesinLoop(Node head)
    {
        Node curr= head;
        int count= 1;
        while(curr.next != null) {
        	count++;
        	curr= curr.next;
        }
    }

}
