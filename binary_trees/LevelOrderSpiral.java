package binary_trees;

import java.util.Stack;

public class LevelOrderSpiral {
	
	public void levelSpiral(){
		Stack<BTNode> q1=new Stack<BTNode>();
		Stack<BTNode> q2=new Stack<BTNode>();
		
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		q1.push(head);
		
		while(!q1.isEmpty() || !q2.isEmpty()){
			while(!q1.isEmpty()){
				BTNode temp=q1.pop();
				System.out.println(temp.data);
				if(temp.leftNode!=null)
					q2.push(temp.leftNode);
				
				if(temp.rightNode!=null)
					q2.push(temp.rightNode);	
			}
			
			while(!q2.isEmpty()){
				BTNode temp=q2.pop();
				System.out.println(temp.data);
				if(temp.rightNode!=null)
					q1.push(temp.rightNode);
				
				if(temp.leftNode!=null)
					q1.push(temp.leftNode);

			}
		}
		
		Depth d=new Depth();
		int height=d.calculateDepth(head);
		boolean direction=true;
		for(int i=0; i<height; i++){
			if(direction){
				recursive(head, i,direction,0);
				direction=false;
			}
			else{
				recursive(head, i,direction,0);
				direction=true;
			}
		}
	}
	
	public void recursive(BTNode node, int height, boolean direction, int temp){
		if(node==null)
			return;
		else if(temp==height)
			System.out.println(node.data);
		else
		{
			if(direction){
				recursive(node.leftNode, height-1, direction, 0);
				recursive(node.rightNode, height-1, direction, 0);
			}else{
				recursive(node.rightNode, height-1, direction, 0);
				recursive(node.leftNode, height-1, direction, 0);
			}
		}
	}
	
	public static void main(String args[]){
		LevelOrderSpiral los=new LevelOrderSpiral();
		los.levelSpiral();
	}
}
