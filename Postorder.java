package com.aq.dfs;

public class Postorder extends AbstractDFS{
	
	public void step1(Node node){
		 dfs(node.left);
	}
	
	public void step2(Node node){
		dfs(node.right);
	}

	public void step3(Node node){		
		System.out.printf("%d ",node.value);
	}
}
