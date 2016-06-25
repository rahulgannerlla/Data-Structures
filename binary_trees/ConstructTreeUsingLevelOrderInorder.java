package binary_trees;

public class ConstructTreeUsingLevelOrderInorder {
	
	public BTNode levelInOrder(BTNode startNode, int in[], int level[], int start, int end){
		if(start>end)
			return null;
		
		
		if(start==end)
			return (new BTNode(in[start]));
		
		
		int index=0;
		boolean found=false;
		for(int i=0; i<level.length-1; i++){
			int data = level[i];
			for(int j=start; j<end; j++){
				if(data==in[j]){
					startNode=new BTNode(data);
					index=j;
					found=true;
					break;
				}
			}
			if(found==true)
				break;
		}
		
		
		startNode.leftNode=levelInOrder(startNode, in, level, start, index-1);
		startNode.rightNode=levelInOrder(startNode, in, level, index+1, end);
		return startNode;
	}
	
	public void preOrderRecursive(BTNode node){
		if(node!=null){
			System.out.print(node.data);
			preOrderRecursive(node.leftNode);
			preOrderRecursive(node.rightNode);
		}
	}
	
	public static void main(String args[]){
		ConstructTreeUsingLevelOrderInorder c=new ConstructTreeUsingLevelOrderInorder();
		BTNode head=c.levelInOrder(null, new int[]{4,2,6,5,7,1,3}, new int[]{1,2,3,4,5,6,7}, 0, 6);
		c.preOrderRecursive(head);
	}
}
