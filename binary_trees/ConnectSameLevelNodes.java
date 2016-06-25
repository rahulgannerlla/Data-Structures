package binary_trees;

public class ConnectSameLevelNodes {
	
	public void sameLevelNodes(BTNode node){
		
		if(node==null)
			return;
		
		if(node.nextRight!=null)
			sameLevelNodes(node.nextRight);
		
		if(node.leftNode!=null){
			if(node.rightNode!=null){
				node.leftNode.nextRight=node.rightNode;
				node.rightNode.nextRight=nextR(node);
			}else
				node.leftNode.nextRight=nextR(node);
			sameLevelNodes(node.leftNode);
		}else if(node.rightNode!=null){
			node.rightNode.nextRight=node.rightNode;
			sameLevelNodes(node.rightNode);
		}else
			sameLevelNodes(nextR(node));
	}
	
	public BTNode nextR(BTNode node){
		
		BTNode temp=node.nextRight;
		
		while(temp!=null){
			if(temp.leftNode!=null)
				return temp.leftNode;
			else if(temp.rightNode!=null)
				return temp.rightNode;
			temp=temp.nextRight;
		}
		
		return null;
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		ConnectSameLevelNodes c=new ConnectSameLevelNodes();
		c.sameLevelNodes(head);
		
		System.out.println(head.leftNode.nextRight.data);
	}
}
