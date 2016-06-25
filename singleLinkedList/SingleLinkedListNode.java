package singleLinkedList;

public class SingleLinkedListNode {
	public int value, downValue;
	SingleLinkedListNode nextNode;
	SingleLinkedListNode downNode;
	
	SingleLinkedListNode(int value){
		this.value=value;
		
	}
	
	SingleLinkedListNode(int value, int downValue){
		this.downValue=downValue;
		
	}

	public SingleLinkedListNode() {
		// TODO Auto-generated constructor stub
	}
}
