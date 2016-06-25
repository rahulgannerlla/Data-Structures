package binary_trees;

public class DoubleTree {
	
	public void dTree(){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		recursiveDouble(head);
		preOrderRecursive(head);
	}
	
	public void recursiveDouble(BTNode head){
		
		if(head==null) return;
		
		recursiveDouble(head.leftNode);
		recursiveDouble(head.rightNode);
		BTNode temp;	
		temp=head.leftNode;
		head.leftNode=new BTNode(head.data);
		head.leftNode.leftNode=temp;
		
	}
	
	public void preOrderRecursive(BTNode node){
		if(node!=null){
			System.out.print(node.data);
			preOrderRecursive(node.leftNode);
			preOrderRecursive(node.rightNode);
		}
	}
	
	public static void main(String args[]){
		DoubleTree d=new DoubleTree();
		d.dTree();
	}
}
