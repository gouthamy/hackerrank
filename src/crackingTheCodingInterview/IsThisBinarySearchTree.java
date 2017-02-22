package crackingTheCodingInterview;

public class IsThisBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	boolean checkBST(Node root) {

		if(root==null)
			return false;
		//check left side
		Node left = root;
		while(left!=null){
			int data = left.data;
			int nextData = left.left.data;
		}
		
		return false;
	}

}
class Node {
	int data;
	Node left;
	Node right;
}