package arrays;

public class SegregateEvenOdd {
	
	public void evenOdd(){
		int a[]=new int[]{12, 34, 45, 9, 8, 90,3};
		int i=0, j=a.length-1;

		while(i<j){
			while(i<j && a[i]%2==0)
				i++;
			
			while(i<j && a[j]%2==1)
				j--;
			
			System.out.println(i+"   "+j);
			
			if(i<j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				i++; j--;
			}
		}
		
		for(int k:a)
			System.out.println(k);
		
	}
	
	public static void main(String args[]){
		SegregateEvenOdd segregateEvenOdd=new SegregateEvenOdd();
		segregateEvenOdd.evenOdd();
	}
}
