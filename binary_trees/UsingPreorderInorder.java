package binary_trees;

public class UsingPreorderInorder {
		 public static int pIndex=0;
		    public BTNode makeBTree(int [] inOrder, int [] preOrder, int iStart, int iEnd ){
		        if(iStart>iEnd){
		            return null;
		        }
		        BTNode root = new BTNode(preOrder[pIndex]);pIndex++;
		 
		        if(iStart==iEnd){
		            return root;
		        }
		        int index = getInorderIndex(inOrder, iStart, iEnd, root.data);
		            root.leftNode = makeBTree(inOrder,preOrder,iStart, index-1);
		            root.rightNode = makeBTree(inOrder,preOrder,index+1, iEnd);
		        return root;
		    }
		    
		    public int getInorderIndex(int [] inOrder, int start, int end, int data){
		        for(int i=start;i<=end;i++){
		            if(inOrder[i]==data){
		                return i;
		            }
		        }
		        return -1;
		    }
	
	public static void preOrderRecursive(BTNode node){
		if(node!=null){
			System.out.print(node.data+"  ");
			preOrderRecursive(node.leftNode);
			preOrderRecursive(node.rightNode);
		}
	}
	
	
	public static void main(String args[]){
		int in[]={4,2,5,1,6,3,7};
		int pre[]={1,2,4,5,3,6,7};
		
		UsingPreorderInorder h=new UsingPreorderInorder();
		BTNode node=h.makeBTree(in, pre, 0, in.length-1);
		preOrderRecursive(node);
		
	}
}
