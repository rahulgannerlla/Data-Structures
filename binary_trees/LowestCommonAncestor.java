package binary_trees;

public class LowestCommonAncestor {
	static boolean v1=false,v2=false;
	public BTNode ancestor(BTNode root, int x, int y){
		if(root==null)
			return null;
		
		if(root.data==x){
			v1=true;
			return root;
		}
			
		if(root.data==y){
			v2=true;
			return root;
		}
		
		BTNode lNode=ancestor(root.leftNode,x,y);
		BTNode rNode=ancestor(root.rightNode, x, y);
		
		if(lNode!=null && rNode!=null)
			return root;
		
		return (lNode!=null)?lNode:rNode;
	}
	
	
	public static void main(String args[]){
		
		Thread t = Thread.currentThread();
        System.out.println(t.isAlive());        
		
		BinaryTree bt=new BinaryTree();
		BTNode head1=bt.getHead();
		
		LowestCommonAncestor l=new LowestCommonAncestor();
		head1=l.ancestor(head1, 2, 8);
		
		if(v1 && v2)
			System.out.println(head1.data);
		else
			System.out.println("No element");
	}
}
