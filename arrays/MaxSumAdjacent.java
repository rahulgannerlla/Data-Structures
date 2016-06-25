package arrays;

import java.util.ArrayList;

public class MaxSumAdjacent {
	int a[];
	
	MaxSumAdjacent(){
		a=new int[]{5,5,10,100,10,5};
	}
	
	public void maximumSumAdjacent(){
		int inc=a[0], excl=0, excl_new;
		
		for(int i=1; i<a.length; i++){
			excl_new= (inc>excl)?inc:excl;
			inc=excl+a[i];
			excl=excl_new;
		}
		int d=(inc>excl)?inc:excl;
		System.out.println("csx"+d);
	}
	
	public static void main(String args[]){
		MaxSumAdjacent maxSumAdjacent=new MaxSumAdjacent();
		maxSumAdjacent.maximumSumAdjacent();
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
	
	}
}
