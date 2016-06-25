package binary_trees;

public class MorrisInorder {
	
	public void morris(BTNode node){
		while(node!=null){
			if(node.leftNode==null){
				System.out.println(node.data);
				node=node.rightNode;
			}else{
				
				BTNode curr=node.leftNode;
				while(curr.rightNode!=null && curr.rightNode!=node)
					curr=curr.rightNode;
				
				if(curr.rightNode==node){
					curr.rightNode=null;
					System.out.println(node.data);
					node=node.rightNode;
				}else{
					curr.rightNode=node;
					node=node.leftNode;
				}	
			}
		}
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		MorrisInorder m=new MorrisInorder();
		m.morris(head);
	}
}
