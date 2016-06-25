package arrays;

public class FindDuplicates {
	
	public void duplicates(){
		int a[]=new int[]{1,2,3,1,3,6,6};
		
		for(int i=0; i<=a.length-1; i++){
			if(a[Math.abs(a[i])]>=0)
				a[Math.abs(a[i])]=-a[Math.abs(a[i])];
			else
				System.out.println(Math.abs(a[i]));
		}
		
	}
	
	public static void main(String args[]){
		FindDuplicates findDuplicates=new FindDuplicates();
		findDuplicates.duplicates();
	}
}
