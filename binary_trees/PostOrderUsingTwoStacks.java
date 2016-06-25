package binary_trees;

import java.util.Stack;

public class PostOrderUsingTwoStacks {
	
	public void postOrder(){
		Stack<BTNode> st1=new Stack<BTNode>();
		Stack<BTNode> st2=new Stack<BTNode>();
		
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		st1.push(head);
		
		while(!st1.isEmpty()){
			BTNode temp=st1.pop();
			
			if(temp.leftNode!=null)
				st1.push(temp.leftNode);
			
			if(temp.rightNode!=null)
				st1.push(temp.rightNode);
			
			st2.push(temp);
		}
		
		while(!st2.isEmpty())
			System.out.println(st2.pop().data);
	}
	
	public static void main(String args[]){
		PostOrderUsingTwoStacks p=new PostOrderUsingTwoStacks();
		p.postOrder();
	}
}
