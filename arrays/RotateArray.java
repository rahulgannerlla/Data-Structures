package arrays;

public class RotateArray {
	int a[], b[];
	
	RotateArray(){
		a=new int[]{1,2,3,4,5};
	}
	
	public void rotate(int d){
		reverse(0,d-1);
		
		for(int i:a)
			System.out.print(i);
		
		System.out.println();
		
		
		reverse(d,a.length-1);
		
		for(int i:a)
			System.out.print(i);
		
		System.out.println();
		
		reverse(0,a.length-1);
		
		for(int i:a)
			System.out.print(i);
	}
	
	public void reverse(int start, int end){
		while(start < end){
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++; end--;
		}
	}
	
	public static void main(String args[]){
		RotateArray rotateArray=new RotateArray();
		rotateArray.rotate(2);
	}
}
