package binary_trees;

public class BinaryTree {
	
	public BTNode getHead(){
		BTNode node1=new BTNode(1);
		BTNode node2=new BTNode(2);
		BTNode node3=new BTNode(3);
		BTNode node4=new BTNode(4);
		BTNode node5=new BTNode(5);
		BTNode node6=new BTNode(6);
		BTNode node7=new BTNode(7);
		
		node1.leftNode=node2;
		node1.rightNode=node3;
		node2.leftNode=node4;
		node2.rightNode=node5;
		node3.leftNode=node6;
		node3.rightNode=node7;
		
		return node1;
	}
	
public static void main(String args[]){
		//BinaryTree bt=new BinaryTree();
	}
}
