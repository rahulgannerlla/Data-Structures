package arrays;

public class MaxMin {
	
	int a[];
	
	MaxMin(){
		a=new int[]{1000,11,445,1,330,3000};
	}
	
	public void maximumMinimum(){
		int i, n=a.length;
		
		int minElement, maxElement;
				
		if(n%2==0){
			if(a[0]>a[1]){
				maxElement=a[0];
				minElement=a[1];
			}else{
				maxElement=a[1];
				minElement=a[0];
			}
			i=2;
		}else{
			i=1;
			maxElement=a[0];
			minElement=a[0];
		}
		
		while(i<n-1){
			if(a[i]>a[i+1]){
				if(a[i]>maxElement)
					maxElement=a[i];
				if(a[i+1]<minElement)
					minElement=a[i+1];
			}else{
				if(a[i+1]>maxElement)
					maxElement=a[i+1];
				if(a[i]<minElement)
					minElement=a[i];
			}
			i=i+2;
		}
		
		System.out.println(maxElement+"    "+minElement);
	}
	
	public static void main(String args[]){
		MaxMin maxMin=new MaxMin();
		maxMin.maximumMinimum();
	}
}
