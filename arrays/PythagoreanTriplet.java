package arrays;

import java.util.Arrays;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[]{3,10,2,4,12,5,13};
		Arrays.sort(arr);
		
		
		for(int i=arr.length-1; i>=2; i--){
			
			int l=0;
			int r=i-1;
			
			while(l<r){
				if(Math.pow(arr[l], 2) + Math.pow(arr[r], 2) == Math.pow(arr[i], 2)){
					System.out.println(l+" "+i+" "+r);
					break;
				}
				
				if(Math.pow(arr[l], 2) + Math.pow(arr[r], 2) <= Math.pow(arr[i], 2))
					l++;
				else
					r--;
				
			//	(Math.pow(arr[l], 2) + Math.pow(arr[r], 2) == Math.pow(arr[i], 2)) ? l++; r--;
			}
			
		}
	}

}
