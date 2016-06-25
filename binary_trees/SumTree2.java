package binary_trees;

public class SumTree2 {
	
	public int sTree(BTNode node){
		if(node==null)
			return 0;
		
		int temp=node.data;
		node.data=sTree(node.leftNode)+sTree(node.rightNode);
		
		return node.data+temp;
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
		
		SumTree2 s=new SumTree2();
		s.sTree(head);
		
		s.preOrderRecursive(head);
	}
}
