package arrays;

public class LargestSumArray {
	int a[];
	
	LargestSumArray(){
		a=new int[]{-2, -3, 4, -1, -2, 1, 5, -3};
	}
	
	public void largeSum(){
		int currentMax=a[0], totalMax=a[0];
		
		for(int i=1;i<a.length ;i++){
			currentMax=max(a[i], currentMax+a[i]);
			totalMax=max(totalMax, currentMax);
		}
		
		System.out.println("Total max"+totalMax);
	}
	
	public int max(int x, int y){
		return (x>=y)?x:y ;
	}
	
	public static void main(String args[]){
		LargestSumArray largestSumArray=new LargestSumArray();
		largestSumArray.largeSum();
	}
}
