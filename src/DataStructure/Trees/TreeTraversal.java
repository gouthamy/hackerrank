package DataStructure.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	void preOrder(Node root) {

		if(root == null)return;

		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);

	}

	void postOrder(Node root) {
		if(root == null)return;

		postOrder(root.left);
		postOrder(root.right);

		System.out.print(root.data+" ");
	}

	void inOrder(Node root) {
		if(root == null)return;

		inOrder(root.left);

		System.out.print(root.data+" ");

		inOrder(root.right);

	}

	static int height(Node root) {
		if(root == null)return -1;

		/*	int leftHeight = height(root.left);
      	int rightHeight = height(root.right);

      	if(leftHeight > rightHeight){
      		return leftHeight + 1;
      	}else
      		return rightHeight + 1;*/
		return 1 + Math.max(height(root.left), height(root.right));
	}


	void top_view(Node root){
		if(root == null) return;
		left_view(root.left);
		System.out.print(root.data + " ");
		right_view(root.right);
	}

	void left_view(Node root){
		if(root == null)return;
		left_view(root.left);
		System.out.print(root.data + " ");
	}

	void right_view(Node root){
		if(root == null)return;
		System.out.print(root.data + " ");
		right_view(root.right);
	}

	void LevelOrder(Node root) {
		if(root == null)return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()){
			Node node = queue.remove();
			System.out.print(node.data + " ");
			if(node.left!=null)
				queue.add(node.left);
			if(node.right!=null)
				queue.add(node.right);
		}

	}
	static Node Insert(Node root,int value){

		Node newNode = new Node(value);
		if(root == null)return newNode;
		Node node = root;
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);

		while(!queue.isEmpty()){

			node = queue.remove();
			


			if(node.left == null){
				if(node.data < value){
					node.left = newNode;
				}
			}
			if(node.right == null){
				if(node.data > value){
					node.right = newNode;
				}
			}
			
			if(node.left!=null)
				queue.add(node.left);
			if(node.right!=null)
				queue.add(node.right);
		}



		return root;
	}



}
class Node {
	public Node(int value) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	int data;
	Node left;
	Node right;
}
