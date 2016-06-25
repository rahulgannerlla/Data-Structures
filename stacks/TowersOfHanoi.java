package stacks;

import java.util.Stack;

public class TowersOfHanoi {
	Stack<Integer> sourceStack, auxStack, destStack;
	
	TowersOfHanoi(){
		sourceStack=new Stack<Integer>();
		auxStack=new Stack<Integer>();
		destStack=new Stack<Integer>();
	}
	
	public void initSourceStack(){
		sourceStack.add(3);
		sourceStack.add(2);
		sourceStack.add(1);
	}
	
	public void iterateMoves(){
		int numberOfMoves=7;
		for(int i=1; i<=numberOfMoves ;i++){
			if(i%3==1)
				moveDisks(sourceStack, destStack);
			
			if(i%3==2)
				moveDisks(sourceStack, auxStack);
			
			if(i%3==0)
				moveDisks(auxStack, destStack);
		}
	}
	
	public void moveDisks(Stack<Integer> source, Stack<Integer> dest){
		if(source.size()==0){
			int top=dest.pop();
			source.push(top);
		}else if (dest.size()==0) {
			int top=source.pop();
			dest.push(top);
		}else if (source.peek() > dest.peek()) {
			//source.push(source.pop());
			source.push(dest.pop());
		}else if (dest.peek() > source.peek()) {
			//dest.push(dest.pop());
			dest.push(source.pop());
		}		
	}
	
	public void print(){
		System.out.println(destStack.peek());
		destStack.pop();
		System.out.println(destStack.peek());
		destStack.pop();
		System.out.println(destStack.peek());
	}
	
	public static void main(String args[]){
		TowersOfHanoi towersOfHanoi=new TowersOfHanoi();
		towersOfHanoi.initSourceStack();
		towersOfHanoi.iterateMoves();
		towersOfHanoi.print();
	}
}
