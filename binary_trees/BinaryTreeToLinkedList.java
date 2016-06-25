package binary_trees;

import java.util.HashSet;
import java.util.Set;

public class BinaryTreeToLinkedList {
	static BTNode head, prev=null;
	public void convert(BTNode root){
		if(root==null)
			return;
		
		convert(root.leftNode);
		if(prev==null){
			head=root;
		}else{
			root.leftNode=prev;
			prev.rightNode=root;
		}
		prev=root;
		convert(root.rightNode);
			
	}
	
	public void printlist(){
		while(head.rightNode!=null)
		{
			System.out.println(head.data+"  ");
			head=head.rightNode;
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head1=bt.getHead();
		
		BinaryTreeToLinkedList b=new BinaryTreeToLinkedList();
		b.convert(head1);
		b.printlist();
		
		HashSet<Integer> nSet=new HashSet<Integer>();
		nSet.add(67);
		
		
		
	}
}
