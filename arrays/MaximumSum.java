package arrays;

public class MaximumSum {
	
	public void maxSum(){
		int a[]=new int[]{80,2,101,3,100};
		int max=a[a.length-1], min=a[a.length-1], temp=0;
		
		for(int i=a.length-2; i>=0; i--){
			System.out.println("max"+max+"    "+"min"+min);
			
			if(a[i]>max){
				max=a[i];min=a[i];
			}else{
				min=a[i];
			}
			if(temp< max-min)
				temp=max-min;
			
		}
		System.out.println(temp);
	}
	
	public static void main(String args[])
	{
		MaximumSum maximumSum=new MaximumSum();
		maximumSum.maxSum();
	}
}
