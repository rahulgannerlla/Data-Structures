package queues;

public class QueueUsingArray {
	int front, rear, max;
	int queueSample[];
	
	QueueUsingArray(int size){
		front=0; rear=-1;
		queueSample=new int[size];
		max=size;
	}
	
	public void insert(int x){
		if(rear==max-1)
			rear=-1;
		queueSample[++rear]=x;
	}
	
	public void remove(){
		if(front==max)
			front=0;
		System.out.println("delete element "+ queueSample[front++]);
	}
	
	public void peek(){
		System.out.println(queueSample[front]);
	}
	
 public static void main(String args[]){
	 QueueUsingArray queueUsingArray=new QueueUsingArray(6);
	 queueUsingArray.insert(1);
	 queueUsingArray.insert(2);
	 queueUsingArray.insert(3);
	 queueUsingArray.insert(4);
	 queueUsingArray.remove(); queueUsingArray.remove();
	 queueUsingArray.peek();
 }
}
