package queues;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {
	Queue<String> queue;
	
	BinaryNumbers(){
		queue=new LinkedList<String>();
	}
	
	public void printBinaryNumbers(int n){
		queue.add("1");
	
		while(!queue.isEmpty() && n>0){
			String element=queue.remove();
			System.out.println(element);
			queue.add(element+"0");
			queue.add(element+"1");
			n--;
		}
		
	}
	
	public static void main(String args[]){
		BinaryNumbers binaryNumbers=new BinaryNumbers();
		binaryNumbers.printBinaryNumbers(10);
	}
}
