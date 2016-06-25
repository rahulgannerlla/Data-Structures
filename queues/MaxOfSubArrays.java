package queues;

import java.util.Deque;
import java.util.LinkedList;

public class MaxOfSubArrays {
	Deque<Integer> elementsDeque;
	int elementsArray[];

	MaxOfSubArrays(){
		elementsDeque=new LinkedList<Integer>();
		elementsArray=new int[]{1,2,3,6,2,5,4,7};
	}
	
	public void MaxOfArrays(int k){
		int i;
		for(i=0; i<k; i++){
			while(!elementsDeque.isEmpty() && elementsArray[elementsDeque.peek()] <= elementsArray[i])
				elementsDeque.removeFirst();
			
			elementsDeque.addLast(i);
		}
		
		for(;i< elementsArray.length ;i++){
			System.out.println(elementsArray[elementsDeque.peekFirst()]);
			
			while(!elementsDeque.isEmpty() && elementsDeque.peek() <= i-k)
				elementsDeque.removeFirst();
			
			while(!elementsDeque.isEmpty() && elementsArray[elementsDeque.peek()] <= elementsArray[i])
				elementsDeque.removeFirst();
			
			elementsDeque.addLast(i);
		}
		System.out.println(elementsArray[elementsDeque.peekFirst()]);
	}
	
	public static void main(String args[]){
		MaxOfSubArrays maxOfSubArrays=new MaxOfSubArrays();
		maxOfSubArrays.MaxOfArrays(3);
	}
}
