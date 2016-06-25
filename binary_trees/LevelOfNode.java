package binary_trees;

public class LevelOfNode {
	
	public void levelNode(BTNode node ,int x, int level){
		if(node==null)
			return;
		if(node.data==x){
			System.out.print(level);
		}
		levelNode(node.leftNode, x, level+1);
		levelNode(node.rightNode, x,level+1);
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		LevelOfNode lNode=new LevelOfNode();
		lNode.levelNode(head, 4, 0);
	}
}
