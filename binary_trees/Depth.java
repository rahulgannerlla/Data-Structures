package binary_trees;

import java.util.LinkedList;
import java.util.Queue;

public class Depth {
	
	public void getDepth(){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		//System.out.println(calculateDepth(head));
		System.out.println(heightIterative(head));
	}
	
	public int calculateDepth(BTNode node){
		//heightIterative(null);
		if(node==null){
			return 0;
		}else{
			int left=calculateDepth(node.leftNode);
			int right=calculateDepth(node.rightNode);
			
			if(left>right)
				return left+1;
			else
				return right+1;
		}
		
		
	}
	
	public int heightIterative(BTNode head){
		
		Queue<BTNode> q=new LinkedList<BTNode>();
		
		q.add(head);
		int height=0, nodecount;
		
		while(true){
			//System.out.println(height);
			nodecount=q.size();
			if(nodecount==0)
				return height;
			
			height++;
			
			while(nodecount>0){
				BTNode temp=q.remove();
				
				if(temp.leftNode!=null)
					q.add(temp.leftNode);
				
				if(temp.rightNode!=null)
					q.add(temp.rightNode);
				
				nodecount--;
			}
		}
	}
	
	public static void main(String args[]){
		Depth depth=new Depth();
		depth.getDepth();
	}
}
