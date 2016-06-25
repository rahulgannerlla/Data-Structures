package queues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ThreeMultiple {
	Queue<Integer> q1, q2, q3;
	int elementsArray[];
	
	ThreeMultiple(int size){
		q1=new LinkedList<Integer>();
		q2=new LinkedList<Integer>();
		q3=new LinkedList<Integer>();
		elementsArray=new int[]{3,5,1,6,7};
	}
	
	public void arrangeElementsInQueues(){

		int totalSum=0;
		Arrays.sort(elementsArray);
		for(int i=0; i<elementsArray.length-1; i++){
			totalSum=totalSum+elementsArray[i];
			if(elementsArray[i]%3==0)
				q1.add(elementsArray[i]);
			else if(elementsArray[i]%3==1)
				q2.add(elementsArray[i]);
			else if(elementsArray[i]%3==2)
				q3.add(elementsArray[i]);
		}
		
		int top;
		if(totalSum % 3==0){
			//reverse the array and print
		}else if(totalSum % 3==1){
			if(q2.isEmpty()){
				top=q3.remove(); 
				totalSum=totalSum-top;
				top=q3.remove();
				totalSum=totalSum-top;
			}else{
				top=q2.remove();
				totalSum=totalSum-top;
			}
		}else if(totalSum % 3==2){
			if(q3.isEmpty()){
				top=q2.remove(); 
				totalSum=totalSum-top;
				top=q2.remove();
				totalSum=totalSum-top;
			}else{
				top=q3.remove();
				totalSum=totalSum-top;
			}
		}
		//empty all the queues into an array, reverse it again and print the result
	}
	
	public static void main(String args[]){
		
	}
}
