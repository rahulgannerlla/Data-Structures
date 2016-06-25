package binary_trees;

public class LeafCount {
	
	public int lCount(BTNode node){
		if(node==null){
			return 1;
		}else{
			int lNode=lCount(node.leftNode);
			int rNode=lCount(node.rightNode);
			
			return (lNode+rNode);
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		LeafCount lc=new LeafCount();
		System.out.println(lc.lCount(head));
	}
}
