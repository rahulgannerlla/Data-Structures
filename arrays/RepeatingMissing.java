package arrays;

public class RepeatingMissing {
	
	public void reMissing(){
		int a[]=new int[]{3,1,3};
		int totalSum=a.length * (a.length+1)/2;
		int product=fact(a.length);
		int arraySum=0, x, y, arrayProduct=1;
		
		for(int i=0; i<a.length; i++){
			arraySum=arraySum+a[i];
			arrayProduct=arrayProduct*a[i];
		}
		
		x=totalSum-arraySum;
		y=product/arrayProduct-1;
		
		System.out.println(x+"  "+y+" "+x/y);
	}
	
	public int fact(int x){
		if(x==1)
			return 1;
		
		return x*(fact(x-1));
	}
	
	public static void main(String args[]){
		RepeatingMissing repeatingMissing=new RepeatingMissing();
		repeatingMissing.reMissing();
	}
}
