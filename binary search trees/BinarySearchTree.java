package bst;

public class BinarySearchTree {
	
	public BSTNode getHead(){
		BSTNode node1=new BSTNode(4);
		BSTNode node2=new BSTNode(2);
		BSTNode node3=new BSTNode(6);
		BSTNode node4=new BSTNode(1);
		BSTNode node5=new BSTNode(3);
		BSTNode node6=new BSTNode(5);
		BSTNode node7=new BSTNode(7);
		
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
