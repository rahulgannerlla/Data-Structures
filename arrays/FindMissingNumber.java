package arrays;

public class FindMissingNumber {
	int a[];
	
	public void findMissingr(){
		a=new int[]{1,2,3,5,6};
		
		int x1=0, j=0;
		
		for(int i=1; i<=a.length; i++, j++){
			x1=x1^i^a[j];
		}
		x1=x1^a.length+1;
		System.out.println(x1);
		
	}
	
	public static void main(String args[]){
		FindMissingNumber findMissingNumber=new FindMissingNumber();
		findMissingNumber.findMissingr();
	}
}
