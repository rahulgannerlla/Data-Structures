package CrackingTheCodingInterview;

public class AdditionList {
static SingleLinkedListNode head1=null, head2=null;
	
	public static void insertBeginningForHead1(int value){
		SingleLinkedListNode newNode=new SingleLinkedListNode(value);
		newNode.downNode=new SingleLinkedListNode(value);
		if(head1==null){
			head1=newNode;
		}else{
			newNode.nextNode=head1;
			head1=newNode;
		}
	}
	
	public static void insertBeginningForHead2(int value){
		SingleLinkedListNode newNode=new SingleLinkedListNode(value);
		newNode.downNode=new SingleLinkedListNode(value);
		if(head2==null){
			head2=newNode;
		}else{
			newNode.nextNode=head2;
			head2=newNode;
		}
	}
	
	public static void addTwoLists(SingleLinkedListNode n1, SingleLinkedListNode n2){
		SingleLinkedListNode head3=null, prev=null;
		int carry = 0, sum = 0;
		
		while(n1!=null || n2!=null){
			
			System.out.println((n1==null? 0 :n1.value) +"  "+(n2==null? 0 :n2.value));
			
			sum = (n1==null? 0 :n1.value)  + (n2==null? 0 :n2.value)  + carry;
			carry = (sum>=10)?1:0;
			sum=sum%10;
			SingleLinkedListNode node=new SingleLinkedListNode(sum);
			
			if(head3==null)
				head3=node;
			else
				prev.nextNode=node;
				
			prev=node;
			if(n1!=null)n1=n1.nextNode;
			if(n2!=null)n2=n2.nextNode;
		}
		
		head3=revSecondList(head3);
		
	    while(head3!=null){
			System.out.print(head3.value+"  ");
			head3=head3.nextNode;
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		insertBeginningForHead1(1);
		insertBeginningForHead1(2);
		insertBeginningForHead1(2);
		insertBeginningForHead2(5);
		insertBeginningForHead2(3);
		insertBeginningForHead2(8);
		
		SingleLinkedListNode n1=revSecondList(head1);
		SingleLinkedListNode n2=revSecondList(head2);
		
		addTwoLists(n1, n2);
	}

}
