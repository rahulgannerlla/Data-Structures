package binary_trees;

public class HeightOfBalancedTree {
	
	public void height(){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
	}
	
	public boolean heightBalance(BTNode node){
		if(node==null)
			return true;
		
		int lh=maxHeight(node.leftNode);
		int rh=maxHeight(node.rightNode);
		
		if( Math.abs(lh-rh) <=1 && heightBalance(node.leftNode) && heightBalance(node.rightNode))
			return true;
		
		return false;
	}
	
	public int maxHeight(BTNode node){
		if(node==null)
			return 0;
		
		return 1+Math.max(maxHeight(node.leftNode), maxHeight(node.rightNode));
	}
	
	public static void main(String args[]){
		
	}
}
