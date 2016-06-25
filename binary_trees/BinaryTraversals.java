package binary_trees;

import java.util.Stack;

public class BinaryTraversals {
	
	public void inOrder(){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		//inOrderRecursive(head);
		//preOrderRecursive(head);
		postOrderRecursive(head);
	}
	
	public void inOrderRecursive(BTNode node){
		if(node!=null){
			inOrderRecursive(node.leftNode);
			System.out.print(node.data);
			inOrderRecursive(node.rightNode);
		}
	}
	
	public void inOrderWithOutRecursion(){
		Stack<BTNode> st=new Stack<BTNode>();
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		while(true){
			if(head!=null){
				st.push(head);
				head=head.leftNode;
			}else{
				if(!st.isEmpty()){
					BTNode temp=st.pop();
					System.out.println(temp.data);
					if(temp.rightNode!=null)
						head=temp.rightNode;
				}else
					break;
			}
		}
	}
	
	public void inOrderWithOutRecursionWithOutStack(){
		
	}
	
	public void preOrderRecursive(BTNode node){
		if(node!=null){
			System.out.print(node.data);
			preOrderRecursive(node.leftNode);
			preOrderRecursive(node.rightNode);
		}
	}
	
	public void postOrderRecursive(BTNode node){
		if(node!=null){
			postOrderRecursive(node.leftNode);
			postOrderRecursive(node.rightNode);
			System.out.print(node.data);
		}
	}
	
	public static void main(String args[]){
		BinaryTraversals btT=new BinaryTraversals();
		//btT.inOrder();
		btT.inOrderWithOutRecursion();
	}
}
