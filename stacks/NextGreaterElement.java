package stacks;

import java.util.Stack;

public class NextGreaterElement {
	
	int elementsArray[];
	Stack<Integer> elementsStack;
	
	NextGreaterElement(){
		elementsArray=new int[]{10,2,3,7,4,9,2};
		elementsStack=new Stack<Integer>();
	}
	
	public void nextGreaterEle(){
		elementsStack.push(elementsArray[0]);
		
		for(int i=1; i<elementsArray.length; i++){
			int next=elementsArray[i];
			if(!elementsStack.isEmpty()){
				int element=elementsStack.pop();
				while(element<next){
					System.out.println(element+"    "+next);
					if(elementsStack.isEmpty())
						break;
					element=elementsStack.pop();;
				}
				
				if(element>next)
					elementsStack.push(element);
			}
			elementsStack.push(next);
		}
		
		while(!elementsStack.isEmpty()){
			System.out.println(elementsStack.pop()+"    "+"-1");
		}
	}
	
	public static void main(String args[]){
		NextGreaterElement nextGreaterElement=new NextGreaterElement();
		nextGreaterElement.nextGreaterEle();
	}
}
