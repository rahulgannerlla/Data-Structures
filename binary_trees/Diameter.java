package binary_trees;

import java.awt.peer.LightweightPeer;

public class Diameter {
	
	public int diameterOfTree(BTNode node){
		
		if(node==null)
			return 0;
		
		int lh=maxHeight(node.leftNode);
		int rh=maxHeight(node.rightNode);
		
		int ldiameter=diameterOfTree(node.leftNode);
		int rdiamater=diameterOfTree(node.rightNode);
		
		return(Math.max(lh+rh+1, Math.max(ldiameter, rdiamater)));
	}
	
	public int[] diameterOofN(BTNode node){
		int res[]=new int[]{0,0};
		if(node==null)
			return res;
		
		int []leftDiameter=diameterOofN(node.leftNode);
		int []rightDiameter=diameterOofN(node.rightNode);
		int height=Math.max(leftDiameter[1],  rightDiameter[1])+1;
		int rootDiameter=leftDiameter[1] + rightDiameter[1]+1;
		res[1]=height;
		res[0]=Math.max(rootDiameter, Math.max(rightDiameter[0], leftDiameter[0]));
		return res;
	}
	
	
	public int maxHeight(BTNode node){
		if(node==null)
			return 0;
		
		return 1+Math.max(maxHeight(node.leftNode), maxHeight(node.rightNode));
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		Diameter d=new Diameter();
		int[] res=d.diameterOofN(head);
		System.out.println(res[1] + " "+res[0]);
		
		
	}
}
