package arrays;

public class SmallestPositiveInteger {
	int j;
	
	public void smallestInteger(){
		int a[]=new int[]{2,3,-7,6,8,1,-10,15};
		
		a=segregate(a);
		
		 for(int i= 0; i < a.length; i++)
			   // if (a[i] > 0){
			    	System.out.print(a[i]+" ");
		
		for(int i=0; i<a.length; i++){
			//System.out.println(a[Math.abs(a[i])-1]);
			if((Math.abs(a[i])-1< a.length) && a[Math.abs(a[i])-1] >0){
				System.out.println(i+" "+(Math.abs(a[i])-1));
				a[Math.abs(a[i])-1]=-a[Math.abs(a[i])-1];
			}
		}
		System.out.println();
		 for(int i= 0; i < a.length; i++)
			   // if (a[i] > 0){
			    	System.out.print(a[i]+ " ");
			    //	return;
			    //}
			 
			 // System.out.println(a.length);
	}
	
	public int[] segregate(int a[]){
		 j=0;
		
		for(int i=0; i<a.length; i++){
			if(a[i]<=0){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		return a;
	}
	
	public static void main(String args[]){
		SmallestPositiveInteger smallestPositiveInteger=new SmallestPositiveInteger();
		smallestPositiveInteger.smallestInteger();
	}
}
