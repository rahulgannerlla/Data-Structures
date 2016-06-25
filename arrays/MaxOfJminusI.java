package arrays;

public class MaxOfJminusI {
	
	public void maximum(){
		int a[]=new int[]{34,8,10,3,2,80,30,33,1};
		
		int leftArray[]=new int[a.length];
		int rightArray[]=new int[a.length];
		
		leftArray[0]=a[0];
		for(int i=1; i<a.length; i++){
			leftArray[i]= (a[i]<leftArray[i-1])?a[i]:leftArray[i-1];
		}
		
		rightArray[a.length-1]=a[a.length-1];
		for(int i=a.length-2; i>=0; i--){
			rightArray[i]= (a[i]>rightArray[i+1])?a[i]:rightArray[i+1];
		}
		
		int i=0, j=0, maxDiff=-1;
		
		while(i<a.length && j<a.length){
			if(leftArray[i]<rightArray[j]){
				maxDiff= (maxDiff > (j-i))? maxDiff:(j-i);
				j=j+1;
			}else
				i=i+1;
		}
		System.out.println(maxDiff);
	}
	
 public static void main(String args[]){
	 MaxOfJminusI maxOfJminusI=new MaxOfJminusI();
	 maxOfJminusI.maximum();
 }
}
