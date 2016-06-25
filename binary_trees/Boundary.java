package binary_trees;

public class Boundary {
	
	public void leftBoundary(BTNode node){
		if(node!=null){
			if(node.leftNode!=null){
				System.out.println(node.data);
				leftBoundary(node.leftNode);
			}
			else if(node.rightNode!=null){
				System.out.println(node.data);
				leftBoundary(node.rightNode);
			}
		}
	}
	
	public void rightBoundary(BTNode node){
		if(node!=null){
			if(node.rightNode!=null){
				System.out.println(node.data);
				rightBoundary(node.rightNode);
			}
			else if(node.leftNode!=null){
				System.out.println(node.data);
				rightBoundary(node.leftNode);
			}
		}
	}
	
	public void leafNodes(BTNode node){
		if(node!=null){
			if(node.leftNode==null && node.rightNode==null)
				System.out.println(node.data);
			leafNodes(node.leftNode);
			leafNodes(node.rightNode);
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		Boundary b=new Boundary();
		b.leftBoundary(head);
		b.leafNodes(head.leftNode);
		b.leafNodes(head.rightNode);
		b.rightBoundary(head.rightNode);
	}
}
