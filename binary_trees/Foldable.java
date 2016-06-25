package binary_trees;

public class Foldable {
	
	public boolean foldable(BTNode node){
		if(node==null)
			return true;
		
		return utilFoldable(node.leftNode, node.rightNode);
	}
	
	public boolean utilFoldable(BTNode node1, BTNode node2){
		if(node1.leftNode==null && node2.rightNode==null)
			return true;
		
		if(node1.leftNode==null || node2.rightNode==null)
			return false;
		
		return utilFoldable(node1.leftNode, node2.rightNode) && utilFoldable(node1.rightNode, node2.leftNode);
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		Foldable f = new Foldable();
		System.out.println(f.foldable(head));
	}
}
