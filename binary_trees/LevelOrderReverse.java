package binary_trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderReverse {
	
	public void levelOrder(){
		Stack<BTNode> st1=new Stack<BTNode>();
		Queue<BTNode> q=new LinkedList<BTNode>();
		
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		q.add(head);
		
		while(!q.isEmpty()){
			BTNode temp=q.remove();
			
			if(temp.rightNode!=null)
				q.add(temp.rightNode);
			
			if(temp.leftNode!=null)
				q.add(temp.leftNode);
			
			st1.push(temp);
		}
		
		while(!st1.isEmpty()){
			System.out.println(st1.pop().data);
		}
		
	}
	
	public static void main(String args[]){
		LevelOrderReverse l=new LevelOrderReverse();
		l.levelOrder();
	}
}
