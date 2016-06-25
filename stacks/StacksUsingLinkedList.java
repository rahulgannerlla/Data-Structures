package stacks;

public class StacksUsingLinkedList {
	SingleLinkedListNode head;
	
	StacksUsingLinkedList(){
		head=null;
	}
	
	public void push(int element){
		SingleLinkedListNode newNode=new SingleLinkedListNode(element);
		if(head==null)
			head=newNode;
		else{
			newNode.nextNode=head;
			head=newNode;
		}
	}
	
	public int pop(){
		SingleLinkedListNode temp=null;
		if(head==null)
			System.out.println("No nodes");
		else{
			temp=head;
			head=head.nextNode;
		}
		return temp.value;
	}
	
	public boolean isEmpty(){
		return (head==null);
	}
	
	public int peek(){
		return head.value;
	}
	
	public static void main(String args[]){
		StacksUsingLinkedList stacksUsingLinkedList=new StacksUsingLinkedList();
		stacksUsingLinkedList.push(3);
		stacksUsingLinkedList.push(2);
		stacksUsingLinkedList.push(1);
		
		System.out.println(stacksUsingLinkedList.pop());
	}
}
