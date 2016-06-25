package binary_trees;

public class Mirror {
	
	public void mirror(BTNode node){
		if(node==null)
			return;
		else{
			BTNode temp;
			temp=node.leftNode;
			node.leftNode=node.rightNode;
			node.rightNode=temp;
			mirror(node.leftNode);
			mirror(node.rightNode);
			
		}
	}
	
	public void inOrderRecursive(BTNode node){
		if(node!=null){
			System.out.print(node.data);
			inOrderRecursive(node.leftNode);
			
			inOrderRecursive(node.rightNode);
		}
	}
	
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		Mirror mirror=new Mirror();
		mirror.inOrderRecursive(head);
		mirror.mirror(head);
		System.out.println();
		mirror.inOrderRecursive(head);
	}
}
