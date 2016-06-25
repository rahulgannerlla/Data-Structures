package bst;

public class PredeccesorSuccessor {
		static BSTNode suc=null, pre=null;
	
		public void preSuc(BSTNode root, int x){
			if(root.data==x){
				if(root.leftNode!=null){
					BSTNode temp=root.leftNode;
					while(temp.rightNode!=null)
						temp=temp.rightNode;
					pre=temp;
				}
				if(root.rightNode!=null){
					BSTNode temp=root.rightNode;
					while(temp.leftNode!=null)
						temp=temp.leftNode;
					suc=temp;
				}
				return;
			}
			
			if(root.data>x){
				suc=root;
				preSuc(root.leftNode, x);
			}
			if(root.data<x){
				pre=root;
				preSuc(root.rightNode, x);
			}
		}
	
	public static void main(String args[]){
		BinarySearchTree bst=new BinarySearchTree();
		
		PredeccesorSuccessor p=new PredeccesorSuccessor();
		p.preSuc(bst.getHead(), 2);
		System.out.println("suc"+suc.data+"pre"+pre.data);
	}
}
