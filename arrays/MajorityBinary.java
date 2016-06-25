package arrays;

public class MajorityBinary {
	int a[];
	
	MajorityBinary(){
		a=new int[]{1,2,3,3,3,3,10};
	}
	
	public void majority(int x){
		
		int index=binary(0, a.length-1, x);
		System.out.println(index);
		if(index==-1)
			return;
		
		if((index+1)<=a.length/2 && a[index+a.length/2]==x)
			System.out.println(true);
		
	}
	
	public int binary(int low, int high, int x){
		
		if(high>=low){
			int mid=high+low/2;
			
			if((mid==0 || x>a[mid-1]) && a[mid]==x)
				return mid;
			else if(x>a[mid])
				return binary(mid+1, high, x);
			else if(x<=a[mid])
				return binary(low, mid-1, x);
		}
		return -1;
		
	}
	
	public static void main(String args[]){
		MajorityBinary majorityBinary=new MajorityBinary();
		majorityBinary.majority(3);
	}
}
