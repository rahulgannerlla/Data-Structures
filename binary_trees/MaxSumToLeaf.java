package binary_trees;

public class MaxSumToLeaf {
	static int max=Integer.MIN_VALUE;
	
	public void mstl(BTNode node, int count){
		if(count>max)
			max=count;
		
		if(node==null)
			return;
	
		mstl(node.leftNode, count+node.data);
		mstl(node.rightNode, count+node.data);
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		MaxSumToLeaf m=new MaxSumToLeaf();
		m.mstl(head, 0);
		System.out.println(max);
	}
}
