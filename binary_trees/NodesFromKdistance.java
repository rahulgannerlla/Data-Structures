package binary_trees;

public class NodesFromKdistance {
	
	public void printNodesDownward(BTNode node, int k){
		if(node==null || k<0)
			return;
		
		if(k==0){
			System.out.println(node.data);
			return ;
		}
		
		printNodesDownward(node.leftNode, k-1);
		printNodesDownward(node.rightNode, k-1);
	}
	
	public int nodes(BTNode root, int result, int k){
		
		if(root==null)
			return -1;
		
		if(root.data==result){
			printNodesDownward(root,k);
			return 0;
		}
		
		int lh=nodes(root.leftNode, result, k);
		
		if(lh!=-1){
			if(lh+1==k)
				System.out.println(root.data);
			else
				printNodesDownward(root.rightNode, k-lh-2);
			
			return lh+1;
		}
		
		int rh=nodes(root.rightNode, result, k);
		
		if(rh!=-1){
			if(rh+1==k)
				System.out.println(root.data);
			else
				printNodesDownward(root.leftNode, k-rh-2);
			
			return rh+1;
		}
		return -1;
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head1=bt.getHead();
		
		NodesFromKdistance n=new NodesFromKdistance();
		n.nodes(head1, 2, 1);
	}
}
