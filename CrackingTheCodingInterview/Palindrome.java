package CrackingTheCodingInterview;

public class Palindrome {

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
	
	public static SingleLinkedListNode revSecondList(SingleLinkedListNode node){
		System.out.println("revvv");
		
		SingleLinkedListNode current=node, prev=null, next;
		
		while(current!=null){
			next = current.nextNode;
			current.nextNode=prev;
			prev=current;
			current=next;
		}
		
		return prev;
	}
	
	public static void checkPalindrome(){
		SingleLinkedListNode slowPtr=head, fastPtr=head, prevPtr=null;
		
		while(fastPtr!=null && fastPtr.nextNode!=null){
			prevPtr=slowPtr;
			slowPtr=slowPtr.nextNode;
			fastPtr=fastPtr.nextNode.nextNode;
		}
		
		if(fastPtr!=null){
			slowPtr=slowPtr.nextNode;
			System.out.println(slowPtr.value);
		}
		
		prevPtr.nextNode=null;
		fastPtr=slowPtr;
		fastPtr=revSecondList(fastPtr);

//	    while(fastPtr!=null){
//			System.out.print(fastPtr.value+"  ");
//			fastPtr=fastPtr.nextNode;
//		}
//	    
//	    while(head!=null){
//			System.out.print(head.value+"  ");
//			head=head.nextNode;
//		}
	    
		boolean result = checkIdenticalList(head, fastPtr);
		
		System.out.println(result);
	}
	
	
	
	public static boolean checkIdenticalList(SingleLinkedListNode node1, SingleLinkedListNode node2){
		
		
		if(node1==null && node2==null)
			return true;
		
		if(node1==null || node2==null)
			return false;
		
		return (node1.value==node2.value && checkIdenticalList(node1.nextNode, node2.nextNode));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("text   " + (3&1));
		
		int a[]=new int[5];
		
		for(int i=0; i<a.length-1; i++){
			if(((i&1)==0 && a[i]<a[i+1]) || ((i & 1)==1 && a[i]>a[i+1])){
				//swap
			}
		}
		
		
		insertBeginningForHead(1);
		insertBeginningForHead(2);
		insertBeginningForHead(3);
		//insertBeginningForHead(3);
		insertBeginningForHead(2);
		insertBeginningForHead(5);
		checkPalindrome();
	}

}
