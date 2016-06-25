package queues;

public class QueueUsingList {
	SingleLinkedListNode front, rear;
	
	QueueUsingList(){
		front=null;
		rear=null;
	}
	
	public void insert(int x){
		SingleLinkedListNode newNode=new SingleLinkedListNode(1);
		
		if(rear==null){
			front=newNode;
			rear=newNode;
		}else{
			rear.nextNode=newNode;
			rear=newNode;
		}
			
	}
	
	public void delete(){
		if(front!=null){
			System.out.println(front.value);
			front=front.nextNode;
			if(front==null)
				rear=null;	
		}
	}
	
 public static void main(String args[]){
	 
 }
}
