package binary_trees;

import java.util.Stack;

public class IterativePreorder {
	
	public void preorder(BTNode node, Stack<BTNode> st){
		st.push(node);
		while(!st.isEmpty()){
			BTNode temp=st.pop();
			System.out.print(temp.data);
			
			if(temp.rightNode!=null)
				st.push(temp.rightNode);
			
			if(temp.leftNode!=null)
				st.push(temp.leftNode);
			
		}
	}
	
	public static void main(String args[]){
		IterativePreorder i=new IterativePreorder();
		
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		Stack<BTNode> st=new Stack<BTNode>();
		
		i.preorder(head, st);
	}
}
