package com.aq.dfs.graph;


public class Main2 {
	/*
	 * 				1
	 *            /  \
	 *          2     3 - on left of 4
	 *         / \  /
	 *        4   5
	 *       /     \
	 *      3       6
	 *          
	 * Depth First Traversal:same as before but now we say 3 is on left of 4
Preorder (Root, Left, Right) : 1 2 4 3 5 6 

	 */
	public static void main(String[] args) {
		boolean [] visited = new boolean[6];
		GraphNode root = new GraphNode(1);
		GraphNode firstLeft = new GraphNode(2);
		GraphNode firstright = new GraphNode(3);
		
		root.left = firstLeft;
		root.right = firstright;
		
		GraphNode secondLeft = new GraphNode(4);
		GraphNode secondRight = new GraphNode(5);
		
		firstLeft.left = secondLeft;
		firstLeft.right = secondRight;
		
		firstright.left =  secondRight;
		secondRight.right =  new GraphNode(6);
		
		secondLeft.left = firstright;
		dfs(root);
	}

	public static void dfs(GraphNode node) {
		if(node == null || node.visited) {
			return;
		}
		node.visited = true;
		System.out.println(node.value);
		dfs(node.left);
		dfs(node.right);
		
	}
}
