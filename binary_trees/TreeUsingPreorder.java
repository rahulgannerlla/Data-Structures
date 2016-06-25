package binary_trees;

public class TreeUsingPreorder {
	static int n=0;
	public BTNode constructTree(int pre[], char index[]){
		
		if(n>index.length-1)
			return null;
		
		int k=n;
		
		BTNode temp=new BTNode(pre[n++]);
		
		if(index[k]=='N'){
			
			temp.leftNode=constructTree(pre, index);
			System.out.println(n);
			temp.rightNode=constructTree(pre, index);
		}
		return temp;
	}
	
	public void preOrderRecursive(BTNode node){
		if(node!=null){
			System.out.print(node.data+"  " );
			preOrderRecursive(node.leftNode);
			preOrderRecursive(node.rightNode);
		}
	}
	
	public static void main(String args[]){
		char pre[]=new char[]{'N','N','L','L','L'};
		int elements[]=new int[]{10,30,20,5,15};
		
		TreeUsingPreorder s=new TreeUsingPreorder();
		BTNode node= s.constructTree(elements, pre);
		s.preOrderRecursive(node);
	}
}
