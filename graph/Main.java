package com.aq.dfs.graph;


public class Main {
	/*
	 * 				1
	 *            /  \
	 *          2     3
	 *         / \  /
	 *        4   5
	 *             \
	 *              6
	 *          
	 * Depth First Traversal:
Preorder (Root, Left, Right) : 1 2 4 5 6 3

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
