package crackingTheCodingInterview;

import java.util.Stack;


/**
 * 
 * @author gyenuganti
 *Iterate over a singly linked list backwards. Call print on each node. 

Example: The list A->B->C should print as 

"C B A"


class Node {
  public Node next;
  public String value;
}
There are 4 solutions 
1) recursive 
2) iterative with O(n) memory 
3) iterative with O(1) memory and O(n²) runtime 
4) iterative with O(1) memory and O(n) runtime (for this solution the initial list may be modified) 

Explain all 4 solutions and write the code for solutions 3 and 4
 */
public class SinglyLinkedListBackward {






	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedNode root = new LinkedNode("A");
		root.next =  new LinkedNode("B");
		root.next.next = new LinkedNode("C");
		
		//recursiveReverse(root);
		//iterativeReverse(root);
		iterativeReverseWithOutMemory(root);

	}

	
	/**
	 * reverse linked list using iterative approach with O(n2) runtime
	 * reverse the LinkedList and iterate
	 * @param root
	 */
	private static void iterativeReverseWithOutMemory(LinkedNode root) {
		if(root == null) return;
		LinkedNode previousNode = null;
		LinkedNode currentNode = root;
		LinkedNode nextNode = null;
		
		
		while(currentNode.next != null){
			
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
			
		}
		currentNode.next = previousNode;
		
		while(currentNode != null){
			System.out.print(currentNode.value+" -> ");
			currentNode = currentNode.next;
		}
	}

	/**
	 * reverse linked list using iterative approach
	 * push node to stack, and pop it
	 * consume O(n) memeory
	 * @param root
	 */
	private static void iterativeReverse(LinkedNode root) {
		if(root == null) return;
		Stack<LinkedNode> stack = new Stack<>();
		
		while(root!=null){
			stack.push(root);
			root = root.next;
		}
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop().value+ "->");
		}
		
	}

	/**
	 * reverse linked list using recursion
	 * @param root
	 */
	private static void recursiveReverse(LinkedNode root) {
		if(root == null) return;
		recursiveReverse(root.next);
		System.out.print(root.value+ "->");
	}
	
	
	
	
	
	
}

class LinkedNode{
	public LinkedNode next;
	public String value;
	public LinkedNode(String value){
		this.value = value;
	}
}

