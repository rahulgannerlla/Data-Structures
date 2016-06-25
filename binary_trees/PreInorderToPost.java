package binary_trees;

public class PreInorderToPost {
	static int preIndex=0;
	public static int search(int[] in,int x, int low, int high){
		//System.out.println();
		for(int i= low; i<=high; i++){
			//System.out.print(i+" ");
			if(in[i]==x)
				return i;
		}
		
		return -1;
	}
	
	public static void preInToPo(int[] in, int[] pre, int low, int high){
		if(low<high  && preIndex<in.length){
			int eFound=search(in, pre[preIndex], low, high);
			if(eFound!=-1){
				int curr=preIndex;
				preIndex++;
				preInToPo(in, pre, low, eFound);
				preInToPo(in, pre, eFound, high);
				System.out.println(pre[curr]+"  ");
			}
		}
	}
	
	public static void main(String args[]){
		int pre[]={1,2,4,5,3,6};
		int in[]={4,2,5,1,3,6};
		
		preInToPo(in, pre, 0, pre.length-1);
	}
}
