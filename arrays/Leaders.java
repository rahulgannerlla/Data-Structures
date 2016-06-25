package arrays;

public class Leaders {
	int a[];
	
	Leaders(){
		a=new int[]{16, 17, 4, 3, 5,2};
	}
	
	public void leadersOnRight(){
		reverse(0,a.length-1);
		int max=a[0];
		System.out.println(max);
		
		for(int i=1; i<a.length-1;i++){
			if(a[i]>max){
				max=a[i];
				System.out.println(max);
			}
				
		}
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
		Leaders leaders=new Leaders();
		leaders.leadersOnRight();
	}
}
