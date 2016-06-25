package stacks;

public class TwoStacksInArray {
	static int top, top2, arraySize;
	static int[] tempArray;
	static String temp;
	
	
	public static void initialize(int size){
		tempArray=new int[size];
		top=-1;
		arraySize=size;
		top2=size;
	}
	
	public static void push1(int newElement){
		if(top>top2-1){
			System.out.println("stack overflow");
			return;
		}
		tempArray[++top]=newElement;
	}
	
	public static void push2(int newElement){
		if(top>top2-1){
			System.out.println("stack overflow");
			return;
		}
		tempArray[--top2]=newElement;
	}
	
	public static int pop1(){
		if(top==-1){
			System.out.println("stack underflow");
			return -1;
		}
		return tempArray[top--]; 
	}
	
	public static int pop2(){
		if(top2==arraySize){
			System.out.println("stack underflow");
			return -1;
		}
		return tempArray[top2++]; 
	}
	
	boolean isEmpty(){
		return(top==-1);
	}
	
	boolean isFull(){
		return (top==arraySize-1);
	}
	
	public static void peek(){
		int temp=0, temp2=0;
		if(top!=-1)
			temp= tempArray[top];
		
		if(top2!=arraySize)
			temp2=tempArray[top2];
		
		System.out.println("temp"+temp+"   tempa"+temp2);
		
		//return temp;
	}
	
	public static void main(String args[]){
		initialize(8);
		push1(1);
		push1(2);
		push1(3);
		push1(4);
		push2(1);
		push2(2);
		push2(3);
		push2(4);
		
		pop2();pop2();
		pop2();//pop2();
		//System.out.println(peek());	
		
		peek();
	}
}
