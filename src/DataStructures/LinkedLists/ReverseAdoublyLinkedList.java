package DataStructures.LinkedLists;

public class ReverseAdoublyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	NULL <-- 2 <--> 4 <--> 6 --> NULL


	Node Reverse(Node head) {
		
		
		if(head == null)return null;

		Node nextNode = null;
		Node currentNode = head;
		Node previousNode = null;
		
		while(currentNode!=null){
		
			nextNode = currentNode.next;
			currentNode.next =  previousNode;
			currentNode.prev = nextNode;
			previousNode = currentNode;
			currentNode = nextNode;
			
		}
		
		
		return previousNode;
	}
	class Node {
		int data;
		Node next;
		Node prev;
	}
}
