package binary_trees;

public class SumTree {
	
	public boolean isLeaf(BTNode node){
		if(node==null)
			return false;
		else if(node.leftNode==null && node.rightNode==null)
			return true;
		
		return false;
	}
	
	public boolean sTree(BTNode node){
		
		int lNode, rNode;
		
		if(node==null || isLeaf(node))
			return true;
		
		if(sTree(node.leftNode) && sTree(node.rightNode)){
			if(node.leftNode==null)
				lNode=0;
			else if(isLeaf(node.leftNode))
				lNode=node.leftNode.data;
			else
				lNode=2*(node.leftNode.data);
			
			if(node.rightNode==null)
				rNode=0;
			else if(isLeaf(node.rightNode))
				rNode=node.rightNode.data;
			else
				rNode=2*(node.rightNode.data);
			
			System.out.println(rNode+lNode);
			
			if(node.data==rNode+lNode)
				return true;
		}
		
		return false;
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		SumTree s=new SumTree();
		System.out.println(s.sTree(head));
	}
}
