package DataStructures.LinkedLists;

public class CompareTwoLinkedLists {

	class Node {
		int data;
		Node next;
	}
	int CompareLists(Node headA, Node headB) {
		if(isNull(headA) && isNull(headB))return 1;
		if(isNull(headA) && !isNull(headB))return 0;
		if(!isNull(headA) && isNull(headB))return 0;
		if(headA.data != headB.data)return 0;
		
		return CompareLists(headA.next,headB.next);
	}
	
	boolean isNull(Object o){
		return o==null?true:false;
	}
}