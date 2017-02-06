package DataStructures.LinkedLists;

public class MergeTwoSortedLinkedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /*	
    1 -> 3 -> 5 -> 6 -> NULL
	2 -> 4 -> 7 -> NULL

	15 -> NULL
	12 -> NULL

	NULL 
	1 -> 2 -> NULL
	*/
	Node MergeLists(Node headA, Node headB) {
		
		Node mergedNode = new Node();
		Node head = mergedNode;
		while(headA!=null || headB!=null){
			if(headA==null){
				mergedNode.next = headB;
				headB = headB.next;
			}else if(headB == null){
				mergedNode.next = headA;
				headA = headA.next;
			}else{
				if(headA.data<=headB.data){
				   mergedNode.next = headA;
				   headA = headA.next;
				}else{
					mergedNode.next = headB;
					headB = headB.next;
				}
			}
			mergedNode = mergedNode.next;
		}
		return head.next;
	}
	
	class Node {
		int data;
		Node next;
	}
}
