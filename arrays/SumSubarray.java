package arrays;

public class SumSubarray {
	public void sum(int sum){
		int a[]=new int[]{1,4,20,3,10,5};
		int start=0, currentSum=a[0];
		
		for(int i=1; i<=a.length; i++){
			
			while(currentSum>sum && start<i-1){
				currentSum=currentSum-a[start];
				start++;
			}
			
			if(currentSum==sum){
				System.out.println(start+"  "+(i-1));
				return ;
			}
			
			if(i<a.length)
				currentSum=currentSum+a[i];
		}
	}
	
	public static void main(String args[]){
		SumSubarray sumSubarray=new SumSubarray();
		sumSubarray.sum(33);
	}
}
