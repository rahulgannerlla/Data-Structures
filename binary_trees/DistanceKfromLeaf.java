package binary_trees;

public class DistanceKfromLeaf {
	static int path[];
	static boolean visited[];
	public void distance(int index, BTNode node, int pathLength){
		if(node==null)
			return;
		
		path[pathLength]=node.data;
		visited[pathLength]=false;
		pathLength++;
		
		if(node.leftNode==null && node.rightNode==null 
				&& pathLength-index-1 >= 0 && visited[pathLength-1-index]==false){
			System.out.println(path[pathLength-1-index]);
			visited[pathLength-1-index]=true;
			return;
		}
		distance(index, node.leftNode, pathLength);
		distance( index, node.rightNode, pathLength);
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head1=bt.getHead();
		
		DistanceKfromLeaf d=new DistanceKfromLeaf();
		
		 path=new int[30];
		visited=new boolean[30];
		
		for(int i=0; i<visited.length-1; i++)
			visited[i]=false;
			
		
		d.distance(1, head1,0);
	}
}
