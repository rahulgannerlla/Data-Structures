package stacks;

public class StacksUsingArrays {
	static int top, top2, arraySize;
	static int[] tempArray;
	static String temp;
	
	
	public static void initialize(){
		tempArray=new int[10];
		top=-1;
		arraySize=10;
		temp="231*+9-";
	}
	
	public static void postfixExpression(){
		char h[]=temp.toCharArray();
		for(int i=0; i<temp.length() ;i++){
			char ch = h[i];
			System.out.println("ccxss"+ch);
			if(Character.isDigit(ch)){
				//System.out.println("ccx"+Character.getNumericValue(ch));
				push(Character.getNumericValue(ch));
			}else{
				int x=pop();
				int y=pop();
				
				switch (ch) {
				case '*':
					push(x*y);
					break;
					
				case '+':
					push(x+y);
					break;
					
				case '-':
					
					push(x-y);
					break;
					
				case '/':
					push(x/y);
					break;
					
				default:
					break;
				}
			}
		}
		
		System.out.println(pop());
	}
	
	public static void push(int newElement){
		if(top==arraySize-1){
			System.out.println("stack overflow");
			return;
		}
		tempArray[++top]=newElement;
	}
	
	public  void push1(int newElement){
		if(top==arraySize-1){
			System.out.println("stack overflow");
			return;
		}
		tempArray[++top]=newElement;
	}
	
	public int pop1(){
		if(top==-1){
			System.out.println("stack underflow");
			return -1;
		}
		return tempArray[top--]; 
	}
	
	
	public static int pop(){
		if(top==-1){
			System.out.println("stack underflow");
			return -1;
		}
		return tempArray[top--]; 
	}
	
	boolean isEmpty(){
		return(top==-1);
	}
	
	boolean isFull(){
		return (top==arraySize-1);
	}
	
	public static int peek(){
		int temp=0;
		if(top!=-1)
			temp= tempArray[top];
		return temp;
	}
	
	public static void main(String args[]){
		initialize();
		
		postfixExpression();
		
		//System.out.println(peek());		
	}
}
