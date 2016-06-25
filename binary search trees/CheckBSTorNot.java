package bst;

public class CheckBSTorNot {
	
	static BSTNode prev=null;
	
	public boolean checkBst(BSTNode node){
		//System.out.println(node.data);
		if(node!=null){
			
			
			if(!checkBst(node.leftNode))
				return false;
			
			
			
			if(prev!=null && node.data<=prev.data)
				return false;
			
			prev=node;
			
			return checkBst(node.rightNode);
		}
		
		return true;
	}
	
	public boolean usingMaxMin(BSTNode root, int min, int max){
		if(root==null)
			return true;
		
		if(root.data<min || root.data>max)
			return false;
		
		return usingMaxMin(root.leftNode,min, root.data) && usingMaxMin(root.rightNode,root.data, max);
	}
	
	public static void main(String args[]){
		CheckBSTorNot c=new CheckBSTorNot();
		BinarySearchTree b=new BinarySearchTree();
		
		System.out.println(c.checkBst(b.getHead()));
		System.out.println(c.usingMaxMin(b.getHead(),Integer.MIN_VALUE, Integer.MAX_VALUE));
	}
}
