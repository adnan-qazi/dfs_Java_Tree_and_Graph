package com.aq.dfs;

public class Main {
	/*
	 * 				1
	 *            /  \
	 *          2     3
	 *         / \
	 *        4   5  
	 * Depth First Traversals:
(a) Inorder (Left, Root, Right) : 4 2 5 1 3
(b) Preorder (Root, Left, Right) : 1 2 4 5 3
(c) Postorder (Left, Right, Root) : 4 5 2 3 1
We use Template Method to declare a template DFS procedure
and concrete Subclasses to implement each algorithm
The results are breathtaking
	 */
	
	public static void main(String[] args) {
		Node root = new Node(1);
		Node firstLeft = new Node(2);
		Node firstright = new Node(3);
		
		root.left = firstLeft;
		root.right = firstright;
		
		Node secondLeft = new Node(4);
		Node secondRight = new Node(5);
		
		firstLeft.left = secondLeft;
		firstLeft.right = secondRight;
		
		new Inorder().dfs(root);
		System.out.println();
		new Preorder().dfs(root);
		System.out.println();
		new Postorder().dfs(root);
		
		
	}
}
