package com.aq.dfs;

public class Inorder extends AbstractDFS{
	
	public void step1(Node node){
		 dfs(node.left);
	}
	
	public void step2(Node node){
		System.out.printf("%d ",node.value);
	}

	public void step3(Node node){			
		dfs(node.right);
	}
}
