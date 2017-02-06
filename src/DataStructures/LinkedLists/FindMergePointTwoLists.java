package DataStructures.LinkedLists;

import java.util.HashMap;


public class FindMergePointTwoLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int FindMergeNode(Node headA, Node headB) {
		HashMap<Node,Integer> map = new HashMap<>();
		while(headA!=null){
			map.put(headA, headA.data);
			headA = headA.next;
		}
		while(headB!=null){
			if(map.containsKey(headB)){
				return headB.data;
			}
			headB = headB.next;
		}
	
		
	   return 0;

	}
	class Node {
	    int data;
	    Node next;
	 }
}
