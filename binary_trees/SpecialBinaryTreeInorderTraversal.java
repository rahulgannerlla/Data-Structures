package binary_trees;

public class SpecialBinaryTreeInorderTraversal {
	
	public void sbtit(){
		int a[]=new int[]{5,10,40,30,28};
		BTNode head=createTree(a, 0, a.length-1);
		preOrderRecursive(head);
	}
	
	public BTNode createTree(int a[], int i, int j){
		
		if(i>j)
			return null;
		
		int index=isMax(a, i, j);
		System.out.println(i+"  "+j+" "+index);
		BTNode node=new BTNode(a[index]);
		node.leftNode=createTree(a,i,index-1);
		node.rightNode=createTree(a, index+1, j);
		return node;
	}
	
	public void preOrderRecursive(BTNode node){
		if(node!=null){
			System.out.print(node.data+"  " );
			preOrderRecursive(node.leftNode);
			preOrderRecursive(node.rightNode);
		}
	}
	
	public int isMax(int a[], int i, int j){
		if(i==j)
			return i;
		
		if(i>j)
			return 0;
		
		
		int max=Integer.MIN_VALUE, index=-1;
		for( ;i<=j; i++){
			if(a[i]>max){
				max=a[i];
				index=i;
			}
		}
		return index;
	}
	
	public static void main(String args[]){
		SpecialBinaryTreeInorderTraversal s=new SpecialBinaryTreeInorderTraversal();
		s.sbtit();
	}
}
