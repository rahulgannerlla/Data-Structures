package arrays;

public class ProductArray {
	
	public void productArray(){
		int a[]=new int[]{10,3,5,6,2};
		int n[]=new int[a.length];
		
		
		int temp=1;
		
		for(int i=0; i<=a.length-1;i++){
			n[i]=temp;
			temp=temp*a[i];
		}
		
		temp=1;
		
		for(int j=a.length-1; j>=0; j--){
			n[j]=n[j]*temp;
			temp=temp*a[j];
		}
		
		for(int i:n)
			System.out.println(i);
	}
	
	public static void main(String args[]){
		ProductArray productArray=new ProductArray();
		productArray.productArray();
	}
}
