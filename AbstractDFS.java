package com.aq.dfs;

public abstract class AbstractDFS {
	public void dfs(Node root) {
	    if(root !=  null) {
	   //Visit the node by Printing the node data  
	     step1(root);
	     step2(root);
	     step3(root);	      
	    }
	  }
	
	public abstract void step1(Node node);
	
	public abstract void step2(Node node);

	public abstract void step3(Node node);
}
//1 2 4 5 3 