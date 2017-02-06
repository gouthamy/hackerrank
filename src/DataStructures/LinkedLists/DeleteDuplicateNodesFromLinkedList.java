package DataStructures.LinkedLists;

import java.util.HashMap;
class Node {
	public Node(int i) {
		this.data = i;
	}
	int data;
	Node next;
	public String toString(){
		return data+"->"+next;
	}
}
public class DeleteDuplicateNodesFromLinkedList {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node n = new Node(1);
		n.next = new Node(1);
		n.next.next = new Node(1);
		n.next.next.next = new Node(3);
		n.next.next.next.next = new Node(3);
		n.next.next.next.next.next = new Node(3);
		n.next.next.next.next.next.next = new Node(3);
		System.out.println(RemoveDuplicates(n));
	}
	/*
	 * 
	 * 
	 * 
	    Sample Input

    	1 -> 1 -> 1 -> 3 -> 5 -> 5 -> NULL
		NULL

		Sample Output

		1 -> 3 -> 5 -> 6 -> NULL
		NULL
	 */

	//key points : sorted list
	//Time Complexity 0(n) space complexity O(n)
	static Node RemoveDuplicates(Node head) {
		if(head == null)return head;
		Node temp = head;
		while(temp.next!=null){
			if(temp.data == temp.next.data){
				temp.next = temp.next.next;
			}else{
				temp = temp.next;
			}
		}
		return head;
	}

	
}
