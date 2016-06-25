package arrays;

public class NumberOfOccurences {
	int a[];
	NumberOfOccurences(){
		a=new int[]{1,1,2,2,2,2,3};
	}
	
	public void occurences(int x){
		int i=firstBinarySearch(x,0,a.length-1);
		int j=lastBinarySearch(x,0,a.length-1);
		
		System.out.println(i+"  "+j);
	}
	
	public int firstBinarySearch(int x, int low, int high){
		
		if(low<=high){
			int mid= (low+high)/2;
			
			if((mid==0 || x>a[mid-1]) && a[mid]==x)
				return mid;
			else if (x>a[mid])
				return firstBinarySearch(x, mid+1, high);
			else
				return firstBinarySearch(x, low, mid-1);
			
		}
		return -1;
	}
	
	public int lastBinarySearch(int x, int low, int high){
		if(low<=high){
			int mid= (low+high)/2;
			
			if((mid==a.length-1 || x<a[mid+1]) && a[mid]==x)
				return mid;
			else if (x<a[mid])
				return lastBinarySearch(x, low, mid-1);
			else
				return lastBinarySearch(x, mid+1, high);
			
		}
		return -1;
	}
	
	public static void main(String args[]){
		NumberOfOccurences numberOfOccurences=new NumberOfOccurences();
		numberOfOccurences.occurences(2);
	}
}
