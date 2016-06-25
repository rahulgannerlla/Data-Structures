package stacks;

import java.util.Stack;

public class ReverseStackUsingRecursion {
	
	Stack<Integer> elementsStack;
	
	ReverseStackUsingRecursion(){
		elementsStack=new Stack<Integer>();
	}
	
	public void initStack(){
		elementsStack.push(4);
		elementsStack.push(3);
		elementsStack.push(2);
		elementsStack.push(1);
	}
	
	public void reverseStack(Stack<Integer> tempStack){
		if(tempStack.isEmpty())
			return;
		int tempVar=tempStack.pop();
		reverseStack(tempStack);
		insertAtBottom(tempStack, tempVar);
	}
	
	public void insertAtBottom(Stack<Integer> tempStack,int tempVar){
		if(tempStack.isEmpty()){
			tempStack.push(tempVar);
		}else{
			int pop=tempStack.pop();
			insertAtBottom(tempStack, tempVar);
			tempStack.push(pop);
		}
	}
	
	public void callReverse(){
		reverseStack(elementsStack);
	}
	
	public void display(){
		System.out.println(elementsStack.peek());
		elementsStack.pop();
		System.out.println(elementsStack.peek());
	}
	
	public static void main(String args[]){
		ReverseStackUsingRecursion reverseStackUsingRecursion=new ReverseStackUsingRecursion();
		reverseStackUsingRecursion.initStack();
		reverseStackUsingRecursion.callReverse();
		reverseStackUsingRecursion.display();
	}
}
