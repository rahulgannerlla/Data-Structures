package arrays;

import java.util.PriorityQueue;

public class MergeKsortedArrays {
	
	public static void mergeArrays(int arr[][]){
		PriorityQueue<ArrayContainer> containerQueue=new PriorityQueue<ArrayContainer>();
		int totalLength=0;
		
		for(int i=0; i<arr.length; i++){
			containerQueue.add(new ArrayContainer(arr[i], 0));
			totalLength=totalLength+arr[i].length;
		}
		
		
		int result[]=new int[totalLength];
		int n=0;
		
		while(!containerQueue.isEmpty()){
			ArrayContainer ac=containerQueue.poll();
			result[n++]=ac.arr[ac.index];
			
			if(ac.index<ac.arr.length-1){
				containerQueue.add(new ArrayContainer(ac.arr, ac.index+1));
			}
			
		}
		
		for(int i:result){
			System.out.print(i+"  ");
		}
		
	}
	
	public static void main(String args[]){
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] arr3 = { 0, 9, 10, 11 };
		
		mergeArrays(new int[][]{arr1, arr2, arr3});
	}
}
