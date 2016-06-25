package binary_trees;

public class InorderSuccessor {
	public static BTNode nextRef=null;
	public void successor(BTNode node){
		if(node!=null){
			successor(node.rightNode);
			node.nextRight=nextRef;
			nextRef=node;
			successor(node.leftNode);
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		InorderSuccessor i=new InorderSuccessor();
		i.successor(head);
		System.out.println(head.leftNode.nextRight.data);
	}
}
