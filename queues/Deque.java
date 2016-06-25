package queues;

public class Deque {
	SingleLinkedListNode front, rear;
	
	Deque(){
		front=null;
		rear=null;
	}
	
	public void insertFirst(int x){
		SingleLinkedListNode newNode=new SingleLinkedListNode(x);
		if(rear==null){
			front=newNode;
			rear=newNode;
		}else{
			newNode.nextNode=front;
			front=newNode;
		}
	}
	
	public void insertLast(int x){
		SingleLinkedListNode newNode=new SingleLinkedListNode(x);
		if(rear==null){
			front=newNode;
			rear=newNode;
		}else{
			rear.nextNode=newNode;
			rear=newNode;
		}
	}
	
	public void deleteFirst(){
		if(front==null)
			return;
		else{
			System.out.println(front.value);
			front=front.nextNode;
			if(front==null)
				rear=null;
		}
	}
	
	public void deleteLast(){
		if(rear==null)
			return;
		else{
			//iterate till last node and delete last node
		}
	}
	
	public static void main(String args[]){
	 
	}
}
