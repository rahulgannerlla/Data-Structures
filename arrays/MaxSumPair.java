package arrays;
import java.util.Arrays;
import java.util.HashMap;


public class MaxSumPair {
	int a[];
	HashMap<Integer, Boolean> result;
	
	MaxSumPair(){
		a=new int[]{3,1,2,7,4};
		result=new HashMap<Integer, Boolean>();
	}
	
	public void twoPointSolution(int number){
		Arrays.sort(a);
		int front=0;
		int rear=a.length-1;
		
		while(front<rear){
			if(a[front]+a[rear]==number){
				System.out.println(a[front]+"   "+a[rear]);
				front++; //rear--;
			}
			else if(a[front]+a[rear]>number)
				rear--;
			else if(a[front]+a[rear]<number)
				front++;
		}
	}
	
	public void hashMapSolution(int number){
		for(int i=0; i< a.length ;i++){
			if(result.get(a[i])==null){
				result.put(number-a[i], true);
			}else{
				System.out.println(a[i]+"   hh   "+(number-a[i]));
			}
		}
	}
	
	public static void main(String args[]){
		MaxSumPair maxSumPair=new MaxSumPair();
		maxSumPair.twoPointSolution(5);
		maxSumPair.hashMapSolution(5);
	}
}
