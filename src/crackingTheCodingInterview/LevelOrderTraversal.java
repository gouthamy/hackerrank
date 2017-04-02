package crackingTheCodingInterview;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(10);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(25);
		root.right.left = new TreeNode(30);
		root.right.right = new TreeNode(35);
		
		LevelOrderTraversal i  = new LevelOrderTraversal();
		System.out.println(" Output by Naive Approach : ");
		i.levelOrderNaiveApproach(root);
		System.out.println(" Output by Better Approach : ");
		i.levelOrderQueue(root);
		System.out.println("height : "+i.height(root));
	}
	
	
	private int height(TreeNode root){
		if(root == null)return 0;
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if(leftHeight < rightHeight)
			return leftHeight + 1;
		else
			return rightHeight + 1;
	}
	
	private void levelOrderQueue(TreeNode root) {
		if(root == null){
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int level = queue.size();
		while(!queue.isEmpty()){
			level = queue.size();
			while(level > 0){
				TreeNode tr = queue.poll();
				System.out.print(tr.data + " ");
				if(tr.left != null)queue.add(tr.left);
				if(tr.right != null)queue.add(tr.right);
				level--;
			}
			System.out.println("");
		}
		
	}


	private void levelOrderNaiveApproach(TreeNode root) {
		// TODO Auto-generated method stub
		
	}


	
}
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right =null;
	}
}
