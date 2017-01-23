package binaryTree;

public class LeftViewOfBinaryTree {

	Node root;
	static int max_level = 0;


	void leftView(){
		leftViewUtil(root,1);
	}


	void leftViewUtil(Node node, int level) {

		if(node == null)
			return;

		if(max_level < level){
			System.out.print(" "+node.data);
			max_level = level;
		}
		leftViewUtil(node.left, level+1);
		leftViewUtil(node.right, level+1);

	}
	public static void main(String[] args){
		LeftViewOfBinaryTree tree = new LeftViewOfBinaryTree();
		tree.root = new Node(12);
		tree.root.left = new Node(10);
		tree.root.right = new Node(30);
		tree.root.right.left = new Node(25);
		tree.root.right.right = new Node(40);

		tree.leftView();
	}
}


class Node{
	int data;
	Node left;
	Node right;

	public Node(int data){
		this.data = data;
		left = right = null;
	}
}