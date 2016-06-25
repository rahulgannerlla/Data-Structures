package arrays;

public class NumberOccuringOddTimes {
	
	public void occuringOddTimes(){
		int a[]=new int[]{1,2,3,2,3,1,3};
		int res=0;
		for(int i=0; i<a.length; i++){
			res=res^a[i];
		}
		System.out.println(res);
	}
	
 public static void main(String args[]){
	 NumberOccuringOddTimes n=new NumberOccuringOddTimes();
	 n.occuringOddTimes();
 }
}
