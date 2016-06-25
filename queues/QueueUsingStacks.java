package queues;

import java.util.Stack;

public class QueueUsingStacks {
	Stack<Integer> stack1, stack2;
	
	QueueUsingStacks(){
		stack1=new Stack<Integer>();
		stack2=new Stack<Integer>();
	}
	
	public void insert(int x){
		if(stack1.isEmpty())
			stack1.push(x);
		else{
			for(int i=stack1.size(); i>0; i--)
				stack2.push(stack1.pop());
			stack1.push(x);
			for(int i=stack2.size(); i>0; i--)
				stack1.push(stack2.pop());
		}
	}
	
	public void delete(){
		System.out.println(stack1.peek());
		stack1.pop();
	}
	
	public static void main(String args[]){
		QueueUsingStacks queueUsingStacks=new QueueUsingStacks();
		queueUsingStacks.insert(1);
		queueUsingStacks.insert(2);
		queueUsingStacks.insert(3);
		queueUsingStacks.insert(4);
		queueUsingStacks.delete();queueUsingStacks.delete();
	}
}
