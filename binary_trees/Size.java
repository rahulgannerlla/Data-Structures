package binary_trees;

public class Size {
	
	public void sizeOfTree(){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		int left=calculateSizeOfTree(head.leftNode);
		int right=calculateSizeOfTree(head.rightNode);
		System.out.println(left+right+1);
	}
	
	public int calculateSizeOfTree(BTNode node){
		if(node==null)
			return 0;
		else
			return (calculateSizeOfTree(node.leftNode)+1+calculateSizeOfTree(node.rightNode));
	}
	
	public static void main(String args[]){
		Size size=new Size();
		size.sizeOfTree();
	}
}
