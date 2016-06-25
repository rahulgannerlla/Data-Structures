package CrackingTheCodingInterview;

public class BinaryTreeHeightBalance {

	public static int height(BTNode node){
		if(node==null)
			return 0;
		
		return 1+height(node.leftNode)+height(node.rightNode);
	}
	
	public static boolean heightBalance(BTNode node){
		
		if(node==null)
			return true;
		
		int lh = height(node.leftNode);
		int rh = height(node.rightNode);
		
		return (Math.abs(lh-rh) <= 1 && heightBalance(node.leftNode) && heightBalance(node.rightNode));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
