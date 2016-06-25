package stacks;

import java.util.Stack;

public class MinStack {

	static Stack<Integer> tempStack, auxStack;
	
	public static void init(){
		tempStack=new Stack<Integer>();
		auxStack=new Stack<Integer>();
	}
	
	public static void pushInBothStacks(int x){
		tempStack.add(x);
		if(auxStack.isEmpty())
			auxStack.add(x);
		else {
			if(x<auxStack.peek())
				auxStack.add(x);
			else
				auxStack.add(auxStack.peek());
		}
	}
	
	public static void popInBothStacks(){
		int x=tempStack.peek();
		tempStack.remove(tempStack.size()-1);
		
		while(x==auxStack.peek()){
			auxStack.remove(auxStack.size()-1);
		}
	}
	
	public static void peekPrint(){
		System.out.println("Temp Stack"+tempStack.peek()+"   Aux Stack"+auxStack.peek());
	}
	
	public static void main(String args[]){
		init();
		pushInBothStacks(18);
		//peekPrint();
		pushInBothStacks(19);
		//peekPrint();
		pushInBothStacks(29);
		//peekPrint();
		pushInBothStacks(15);
		//peekPrint();
		pushInBothStacks(16);
		//peekPrint();
		popInBothStacks();
		peekPrint();
		popInBothStacks();
		peekPrint();
//		popInBothStacks();
//		peekPrint();
//		popInBothStacks();

		
	}
}
