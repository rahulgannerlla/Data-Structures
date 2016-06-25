package arrays;

public class MinLengthUnsorted {
	
	public void lengthUnsorted(){
		int a[]=new int[]{10, 12, 20, 30, 25, 40, 32, 31, 35, 60};
		int i=0,j=a.length-1, max, min;
		
		while(a[i]<a[i+1])
			i++;
		
		while(a[j]>a[j-1])
			j--;
		
		System.out.println(i+"    "+j);
		max=a[i]; min=a[i];
		for(int k=i+1;k<=j;k++){
			if(a[k]>max)
				max=a[k];
			if(a[k]<min)
				min=a[k];
		}
		
		System.out.println(i+"    "+j);
		
		for(int k=0; k<i; k++)
			if(a[k]>min){
				i=k;
				break;
			}
		
		for(int k=a.length-1; k>=j+1; k--)
			if(a[k]<max){
				j=k;
				break;
			}
		System.out.println(i+"    "+j);
	}
	
	public static void main(String args[]){
		MinLengthUnsorted minLengthUnsorted=new MinLengthUnsorted();
		minLengthUnsorted.lengthUnsorted();
	}
}
