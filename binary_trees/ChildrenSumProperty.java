package binary_trees;

public class ChildrenSumProperty {
	
	public void childrenSum(BTNode node){
		if(node==null)
			return;
		else if(node.leftNode==null && node.rightNode==null)
			System.out.println(node.data + "leaf");
		else{
			childrenSum(node.leftNode);
			childrenSum(node.rightNode);
			node.data=node.leftNode.data+node.rightNode.data;
//			if(node.data==node.leftNode.data+node.rightNode.data)
//			{
//				System.out.println(node.data+"True");
//			}else
//				System.out.println(node.data+"false");
		}	
	}
	
	public void preOrderRecursive(BTNode node){
		if(node!=null){
			System.out.print(node.data+"  ");
			preOrderRecursive(node.leftNode);
			preOrderRecursive(node.rightNode);
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		ChildrenSumProperty csp=new ChildrenSumProperty();
		csp.childrenSum(head);
		csp.preOrderRecursive(head);
	}
}
