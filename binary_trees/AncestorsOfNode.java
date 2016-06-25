package binary_trees;

public class AncestorsOfNode {
	
	public void ancestors(BTNode node, String path, int x){
		if(node==null)
			return;
		
		if(node.data==x)
			System.out.println(path);
		
		ancestors(node.leftNode, path+" "+node.data+" ", x);
		ancestors(node.rightNode, path+" "+node.data+" ", x);
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		AncestorsOfNode a =new AncestorsOfNode();
		a.ancestors(head, "", 4);
	}
}
