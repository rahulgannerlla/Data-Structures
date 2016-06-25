package arrays;

public class FloorCeil {
	int a[];
	
	FloorCeil(){
		a=new int[]{1,2,8,10,10,12,19};
	}
	
	public void binary(int low, int high, int x){
		if(high-low==1){
			System.out.println(a[high]+"   "+a[low]);
			return;
		}
		
		int mid=(high+low)/2;
		
		if(a[mid]>x)
			binary(low, mid, x);
		else
			binary(mid,high,x);
		
	}
	
	public void execute(){
		binary(0, a.length-1, 11);
	}
	
	public static void main(String args[]){
		FloorCeil floorCeil=new FloorCeil();
		floorCeil.execute();
	}
}
