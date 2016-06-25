package binary_trees;

public class MaxWidth {
	int count[];
	
	public void maxWidth1(){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		int height=calculateDepth(head);
		 count=new int[height];
		 preOrderRecursive(head, 0);
	}
	
	public int calculateDepth(BTNode node){
		if(node==null){
			return 0;
		}else{
			int left=calculateDepth(node.leftNode);
			int right=calculateDepth(node.rightNode);
			
			if(left>right)
				return left+1;
			else
				return right+1;
		}
	}
	
	public void preOrderRecursive(BTNode node, int level){
		if(node!=null){
			count[level]++;
			preOrderRecursive(node.leftNode, level+1);
			preOrderRecursive(node.rightNode, level+1);
		}
	}
	
	public static void main(String args[]){
		MaxWidth m=new MaxWidth();
		m.maxWidth1();
		for(int i:m.count)
			System.out.println(i+"  ");
		
	}
}
