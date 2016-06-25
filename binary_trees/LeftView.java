package binary_trees;

public class LeftView {
	public static int max=-1;
	
	public void leftView(BTNode node, int level){
		if(node==null)
			return;
		
		if(level>max){
			System.out.println(node.data);
			max=level;
		}
		
		leftView(node.rightNode, level+1);
		leftView(node.leftNode, level+1);
		
	}
	
	public static void main(String args[]){
		BinaryTree bt=new BinaryTree();
		BTNode head=bt.getHead();
		
		LeftView l=new LeftView();
		l.leftView(head, 0);
	}
}
