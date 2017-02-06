package DataStructures.LinkedLists;

import java.util.Stack;

public class InsertANodeIntoSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class Node {
		int data;
		Node next;
		Node prev;
	}
	// 1->2->4->5->null    3
	Node SortedInsert(Node head,int data) {
		Node insert = new Node();
		insert.data = data;

		if(head == null){
			return insert;
		}else if(data<head.data){
			insert.next = head;
			head.prev = insert;
			head = insert;
		}else{
			Node current = head;
			while(current.next!=null && current.data<data){
				current = current.next;
			}
			if(data<current.data){
				Node previous = current.prev;

				previous.next = insert;
				insert.next = current;
				insert.prev = previous;
			}else{
				current.next = insert;
				insert.prev = current;
			}

		}
		return head;
	}

	public static boolean isBalanced(String expression) {
		if(expression!=null && expression.length()<1)return false;
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<expression.length();i++){
			char ch = expression.charAt(i);
			switch(ch){
			case '(':
			case '[':
			case '{':{
				stack.push(ch);
				break;
			}
			case '}':{
				if(stack.peek() == '{'){
					stack.pop();
				}
				break;
			}
			case ']':{
				if(stack.peek() == ']'){
					stack.pop();
				}
				break;
			}
			case ')':{
				if(stack.peek() == ')'){
					stack.pop();
            	}
				break;
			}
			}
		}
		if(stack.isEmpty())return true;
		else return false;

	}

}
