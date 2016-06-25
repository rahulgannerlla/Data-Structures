package binary_trees;

public class RootToLeaf {
	
	public void rToL(BTNode node, String str){
		if(node==null){
			return;
		}else if (node.leftNode==null||node.rightNode==null){
			System.out.println(str+node.data);
		}else{
			rToL(node.leftNode, str+node.data);
			rToL(node.rightNode, str+node.data);
		}
	}
	
	public void rToL(BTNode node, int str){
		if(node==null){
			return;
		}else if (node.leftNode==null||node.rightNode==null){
			System.out.println(str+node.data);
		}else{
			rToL(node.leftNode, str+node.data);
			rToL(node.rightNode, str+node.data);
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		RootToLeaf r=new RootToLeaf();
		r.rToL(head, "");
		r.rToL(head, 0);
	}
}
