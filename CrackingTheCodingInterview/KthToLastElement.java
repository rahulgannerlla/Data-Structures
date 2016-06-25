package CrackingTheCodingInterview;

public class KthToLastElement {
	
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
	
	public static void kToLastElement(int k){
		SingleLinkedListNode current=head, secondPtr=head;
		
		while(k!=0){
			if(current==null)
				return;
			current=current.nextNode;
			k--;
		}
		
		if(current==null)
			return;
		
		while(current!=null){
			current=current.nextNode;
			secondPtr=secondPtr.nextNode;
		}
		
		System.out.println(secondPtr.value);
		
	}
	
	public static void main(String args[]){
		insertBeginningForHead(1);
		insertBeginningForHead(23);
		insertBeginningForHead(24);
		insertBeginningForHead(5);
		insertBeginningForHead(3);
		insertBeginningForHead(8);
		kToLastElement(3);
	}
}
