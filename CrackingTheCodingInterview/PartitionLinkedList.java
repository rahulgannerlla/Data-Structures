package CrackingTheCodingInterview;

public class PartitionLinkedList {
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
	
	public static SingleLinkedListNode partitionList(int x){
		
		SingleLinkedListNode fList=null, sList=null;
		SingleLinkedListNode current=head;
		
		while(current!=null){
			SingleLinkedListNode next=current.nextNode;
			current.nextNode=null;
			
			if(current.value < x){
				current.nextNode=fList;
				fList=current;
			}else{
				current.nextNode=sList;
				sList=current;
			}
			current=next;
		}
		
		if(fList==null)
			return sList;
		
		SingleLinkedListNode temp=fList;
		while(fList.nextNode!=null){
			fList=fList.nextNode;
		}
		
		fList.nextNode=sList;
		
		return temp;
	}
	
	public static void main(String args[]){
		
		insertBeginningForHead(1);
		insertBeginningForHead(23);
		insertBeginningForHead(24);
		insertBeginningForHead(5);
		insertBeginningForHead(3);
		insertBeginningForHead(8);
		
		SingleLinkedListNode node=partitionList(7);
		
		while(node!=null){
			System.out.println(node.value);
			node=node.nextNode;
		}
	}
}
