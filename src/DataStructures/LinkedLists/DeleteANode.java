package DataStructures.LinkedLists;

public class DeleteANode {


	Node Delete(Node head, int position) {
		// Complete this method
		if(position == 0)
			return head!=null?head.next:null;
		Node trackNode = head;
		int currentPosition = 0;

		while(trackNode.next!=null && currentPosition < position-1){
			currentPosition++;
			trackNode = trackNode.next;
		}
		trackNode.next = trackNode.next.next;
		return head;

	}

}
class Node {
	int data;
	Node next;
}