package DataStructures.LinkedLists;

public class PrintInReverse {

	void ReversePrint(Node head) {
		                  

		if(head == null)return;
		
		ReversePrint(head.next);
		System.out.println(head.data);

	}
    // You only need to complete this method. 
    Node Reverse(Node head) {

    	if(head == null)return null;
    	Reverse(head.next);
    	
    	
    	return null;
    }

	class Node {
		int data;
		Node next;
	}
}
