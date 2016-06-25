package stacks;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	Queue<Integer> queue1, queue2;
	
	StackUsingTwoQueues(){
		queue1=new LinkedList<Integer>();
		queue2=new LinkedList<Integer>();
	}
	
	public void enqueue(int x){
		if(queue1.peek()==null)
			queue1.add(x);
		else{
			for(int i=queue1.size(); i>0;i--)
				queue2.add(queue1.remove());
			queue1.add(x);
			for(int i=queue2.size(); i>0;i--)
				queue1.add(queue2.remove());
		}
	}
	
	public void dequeue(){
		System.out.println(queue1.remove());
	}
	
 public static void main(String args[]){
	 StackUsingTwoQueues stackUsingTwoQueues=new StackUsingTwoQueues();
	 stackUsingTwoQueues.enqueue(1);
	 stackUsingTwoQueues.enqueue(2);
	 stackUsingTwoQueues.enqueue(3);
	 stackUsingTwoQueues.enqueue(4);
	 stackUsingTwoQueues.enqueue(5);
	 
	 stackUsingTwoQueues.dequeue();
	 
	 
 }
}
