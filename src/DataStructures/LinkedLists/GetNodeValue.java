package DataStructures.LinkedLists;

public class GetNodeValue {
	class Node {
		int data;
		Node next;
	}
	  
	int data;
	int length;
	//counting from reverse
	int GetNode(Node head, int n){
		
		return data;
	}
	
	void getNode(Node head, int n){
		if(head == null)return;
		getNode(head.next,n);
		if(n == length){
			data = head.data;
			return;
		}
		length++;
		
	}
	
}
