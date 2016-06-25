package binary_trees;

import java.util.Stack;

public class PostOrderUsingOneStack {
	
	public void postOrder(){
		Stack<BTNode> st1=new Stack<BTNode>();
		
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		do {
			while(head!=null){
				if(head.rightNode!=null)
					st1.push(head.rightNode);
				st1.push(head);
				head=head.leftNode;
			}
			
			head=st1.pop();
			
			
			if(!st1.isEmpty())
				if(head.rightNode!=null && head.rightNode==st1.peek()){
					st1.pop();
					st1.push(head);
					head=head.rightNode;
				}else{
					System.out.println(head.data);
					head=null;
				}
			else{
				System.out.println(head.data);
				head=null;
			}
		} while (!st1.isEmpty());
	}
	
	public static void main(String args[]){
		PostOrderUsingOneStack p=new PostOrderUsingOneStack();
		p.postOrder();
	}
}
