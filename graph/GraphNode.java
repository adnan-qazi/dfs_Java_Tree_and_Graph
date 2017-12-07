package com.aq.dfs.graph;

import com.aq.dfs.Node;

public class GraphNode{

	public boolean visited;	
	
	public GraphNode(int value) {
		this.value = value;
	}

	public GraphNode left;
	public GraphNode right;
	public int value;	

}
