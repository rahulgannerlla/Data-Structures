package arrays;

public class TwoMoreNumbers {
	
	public void twoNumbers(){
		int a[]=new int[]{4,2,4,5,2,3,1};
		int size=a.length-2;
		int arraySum=0, arrayProduct = 1;
		int sum=(size*(size+1))/2;
		
		for(int i=0; i<a.length; i++){
			arraySum=arraySum+a[i];
			arrayProduct=arrayProduct*a[i];
		}
		System.out.println(arraySum+" "+sum);
		arraySum=arraySum-sum;
		System.out.println(arrayProduct+" "+fact(size));
		arrayProduct=arrayProduct/fact(size);
		
		
		
		int d=(int) Math.sqrt(arraySum*arraySum - 4*arrayProduct);
		
		System.out.println((arraySum+d)/2 +"  "+ (arraySum-d)/2);	
	}
	
	public int fact(int x){
		if(x==1)
			return 1;
		
		return x*fact(x-1);
	}
	
public static void main(String args[]){
	TwoMoreNumbers twoMoreNumbers=new TwoMoreNumbers();
	twoMoreNumbers.twoNumbers();
	}
}
