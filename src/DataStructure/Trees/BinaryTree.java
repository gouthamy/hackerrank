package DataStructure.Trees;

public class BinaryTree {

	Node root;

	/* Given a binary tree, print out all of its root-to-leaf
	       paths, one per line. Uses a recursive helper to do the work.*/
	void printPaths(Node node) 
	{
		int path[] = new int[1000];
		printPathsRecur(node, path, 0);
	}

	/* Recursive helper function -- given a node, and an array containing
	       the path from the root node up to but not including this node,
	       print out all the root-leaf paths. */
	void printPathsRecur(Node node, int path[], int pathLen) 
	{
		if (node == null)
			return;

		/* append this node to the path array */
		path[pathLen] = node.data;
		pathLen++;

		/* it's a leaf, so print the path that led to here */
		if (node.left == null && node.right == null)
			printArray(path, pathLen);
		else
		{ 
			/* otherwise try both subtrees */
			printPathsRecur(node.left, path, pathLen);
			printPathsRecur(node.right, path, pathLen);
		}
	}

	/* Utility that prints out an array on a line */
	void printArray(int ints[], int len) 
	{
		int i;
		for (i = 0; i < len; i++) 
			System.out.print(ints[i] + " ");
		System.out.println("");
	}

	/* Driver program to test all above functions */
	 public static void main(String args[])
	    {
	        /* creating a binary tree and entering the nodes */
	        BinaryTree tree = new BinaryTree();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	 
	        /* print inorder traversal of the input tree */
	        System.out.println("Inorder traversal of input tree is :");
	        tree.inOrder();
	        System.out.println("");
	 
	        /* convert tree to its mirror */
	        tree.mirror();
	 
	        /* print inorder traversal of the minor tree */
	        System.out.println("Inorder traversal of binary tree is : ");
	        tree.inOrder();
	 
	    }
	 void mirror()
	    {
	        root = mirror(root);
	    }
	 
	 
	/* Node mirror(Node node)
	    {
	        if (node == null)
	            return node;
	 
	         do the subtrees 
	        Node left = mirror(node.left);
	        Node right = mirror(node.right);
	 
	         swap the left and right pointers 
	        node.left = right;
	        node.right = left;
	 
	        return node;
	    }*/
	 
	 Node mirror(Node node)
	    {
	        if (node == null)
	            return node;
	 
	        /* do the subtrees */
	        
	        //swap
	        Node temp = node.left;
	        node.left = node.right;
	        node.right = temp;
	 
	        /* swap the left and right pointers */
	       mirror(node.left);
	       mirror(node.right);
	 
	        return node;
	    }
	 void inOrder()
	    {
	        inOrder(root);
	    }
	 
	    /* Helper function to test mirror(). Given a binary
	       search tree, print out its data elements in
	       increasing sorted order.*/
	    void inOrder(Node node)
	    {
	        if (node == null)
	            return;
	 
	        inOrder(node.left);
	        System.out.print(node.data + " ");
	 
	        inOrder(node.right);
	    }

	private static int height(Node tree) {
		if(tree == null)return 0;
		int leftHeight = height(tree.left);
		int rightHeight = height(tree.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}
}
