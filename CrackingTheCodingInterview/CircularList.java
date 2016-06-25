package CrackingTheCodingInterview;

public class CircularList {

static SingleLinkedListNode head=null;
	
	public static void insertBeginningForHead(int value){
		SingleLinkedListNode newNode=new SingleLinkedListNode(value);
		newNode.downNode=new SingleLinkedListNode(value);
		if(head==null){
			head=newNode;
		}else{
			newNode.nextNode=head;
			head=newNode;
		}
	}
	
	public static void cirList(){
		SingleLinkedListNode node=head;
		
		while(node.nextNode!=null && node.value < node.nextNode.value){
			if(node.nextNode==null)
				return ;
			
			if(node.nextNode==head)
				break;
			
			node=node.nextNode;
		}
		
		if(node.nextNode==head)
			System.out.println(head.value);
		else
			System.out.println(node.nextNode.value);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		insertBeginningForHead(1);
		insertBeginningForHead(23);
		insertBeginningForHead(24);
		insertBeginningForHead(5);
		insertBeginningForHead(3);
		insertBeginningForHead(8);
		
	}

}
