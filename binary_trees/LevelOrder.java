package binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
	
	public void level(){
		Queue<BTNode> q=new LinkedList<BTNode>();
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		q.add(head);
		
		while(!q.isEmpty()){
			BTNode temp=q.peek();
			//System.out.println(temp.data);
			q.remove();
			if(temp.leftNode!=null)
				q.add(temp.leftNode);
			if(temp.rightNode!=null)
				q.add(temp.rightNode);
			
		}
		
		Depth d=new Depth();
		int height=d.calculateDepth(head);
		
		for(int i=0; i<height;i++){
			recursive(head, i, 0);
		}
	}
	
	public void recursive(BTNode node, int height, int temp){
		if(node==null)
			return;
		else if(height==temp)
			System.out.println(node.data);
		else{
			recursive(node.leftNode, height-1,0);
			recursive(node.rightNode, height-1,0);
		}
		
	}
	
	public static void main(String args[]){
		LevelOrder l=new LevelOrder();
		l.level();
	}
}
