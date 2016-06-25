package arrays;

public class SmallestMissing {
	
	public void missing(){
		int a[]=new int[]{0, 1, 2, 3, 4, 5, 6, 7, 10};
		int i;
		if(a[0]==0 && a.length>=0){
			for( i=1; i<a.length; i++){
				if(a[i]!=a[i-1]+1){
					System.out.println(i);
					break;
				}
			}
			if(i==a.length)
				System.out.println(i);
		}
		else
			System.out.println(0);
	}
	
	public static void main(String args[]){
		SmallestMissing smallestMissing=new SmallestMissing();
		smallestMissing.missing();
	}
}
