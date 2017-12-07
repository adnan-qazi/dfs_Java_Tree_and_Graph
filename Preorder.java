package com.aq.dfs;

public class Preorder extends AbstractDFS{
	
	public void step1(Node node){
		 System.out.printf("%d ",node.value);
	}
	
	public void step2(Node node){
		 dfs(node.left);
	}

	public void step3(Node node){
		dfs(node.right);
	}
}
