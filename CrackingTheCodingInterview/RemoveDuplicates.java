package CrackingTheCodingInterview;

import java.util.HashSet;


public class RemoveDuplicates {
	
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
	
	public static void remDuplicates(){
		SingleLinkedListNode current=head, prev=current;
		HashSet<Integer> hSet=new HashSet<Integer>();
		
		while(current!=null){
			if(hSet.contains(current.value)){
				prev.nextNode=current.nextNode;
				current=current.nextNode;
			}else{
				hSet.add(current.value);
				prev=current;
				current=current.nextNode;
			}
		}
		current=head;
		while(current!=null){
			System.out.println(current.value);
			current=current.nextNode;
		}
		
	}
	
	public static void main(String args[]){
		insertBeginningForHead(1);
		insertBeginningForHead(23);
		insertBeginningForHead(1);
		insertBeginningForHead(5);
		remDuplicates();
	}
}
