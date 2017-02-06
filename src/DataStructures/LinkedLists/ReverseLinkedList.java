package DataStructures.LinkedLists;

public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 	Sample Input

		NULL 
		2 --> 3 --> NULL

		Sample Output

		NULL
		3 --> 2 --> NULL
	*/

	Node Reverse(Node head) {
		if(head == null)return head;
		Node previousNode = null;
		Node currentNode = head;
		Node nextNode = null;
		
		while(currentNode!=null){
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}

		return previousNode;
	}

	class Node {
		int data;
		Node next;
	}
}
