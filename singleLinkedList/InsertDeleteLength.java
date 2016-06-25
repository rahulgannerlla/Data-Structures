package singleLinkedList;

import java.util.HashMap;

public class InsertDeleteLength {
	private static SingleLinkedListNode head, head2, head3;
	
	InsertDeleteLength(){
		head=null;
		head2=null;
		head3=null;
	}
	
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
	
	public static void insertBeginningForHead2(int value){
		SingleLinkedListNode newNode=new SingleLinkedListNode(value);
		if(head2==null){
			head2=newNode;
		}else{
			newNode.nextNode=head2;
			head2=newNode;
		}
	}
	
	public static void insertBeginningForHead3(int value, SingleLinkedListNode node){
		SingleLinkedListNode newNode=new SingleLinkedListNode(value);
		if(head3==null){
			head3=newNode;
		}else{
			newNode.nextNode=head3;
			newNode.downNode=node;
			head3=newNode;
		}
	}
	
	public static void deleteBeginning(){
		//SingleLinkedListNode deleteNode=head;
		head=head.nextNode;
	}
	
	public static void lengthIterative(SingleLinkedListNode node, int count){
		if(node!=null){
			lengthIterative(node.nextNode, ++count);
		}
		else
			System.out.println(count);
	}
	
	public static void searchIterative(SingleLinkedListNode node, int value){
		if(node!=null){
			if(node.value!=value)
				searchIterative(node.nextNode, value);
			else{
				System.out.println("Element found");
				return;
			}
		}
		else
			System.out.println("Element not found");
	}
	
	
	public static void printMiddle(){
		SingleLinkedListNode firstPtr=head, secondPtr=head;
		
		if(firstPtr.nextNode==null || firstPtr==null)
			return;
		
		while(secondPtr!=null && secondPtr.nextNode!=null ){
			firstPtr=firstPtr.nextNode;
			secondPtr=secondPtr.nextNode.nextNode;
		}
		
		System.out.print(firstPtr.value);
	}
	
	public static void nthNodeFromEnd(int n){
		SingleLinkedListNode firstPtr=head, secondPtr=head;
		
		if(firstPtr==null)
			return;
		
		while(n>0 && secondPtr!=null){
			secondPtr=secondPtr.nextNode;
			n--;
		}
		
		if(n<0)
			System.out.print("Input incorrect");
		
		
		while(secondPtr !=null){
			firstPtr=firstPtr.nextNode;
			secondPtr=secondPtr.nextNode;
		}
		
		System.out.print(firstPtr.value);
	}
	
	
	public static void reverseIterative(){
		    SingleLinkedListNode previousNode=null, currentNode=head, next;
		    
		    while(currentNode!=null){
		    	next=currentNode.nextNode;
		    	currentNode.nextNode=previousNode;
		    	previousNode=currentNode;
		    	currentNode=next;
		    }
		    
		    head=previousNode;
	}
	
	public static SingleLinkedListNode reverseRecursive(SingleLinkedListNode node){
		
		if(node==null)
			return null;
		
		if(node.nextNode ==null )
			return node;
		
		SingleLinkedListNode secondNode=node.nextNode;
		node.nextNode=null;
		SingleLinkedListNode headNode=reverseRecursive(secondNode);
		secondNode.nextNode=node;
		return headNode;
	}
	
	public static void display(SingleLinkedListNode printNode){
		//System.out.println(head3);
		SingleLinkedListNode tempNode=printNode;
		
		while(tempNode!=null){
			System.out.println(tempNode.value);
			tempNode=tempNode.nextNode;
		}
	}
	
	public static void detectCycle(){
		SingleLinkedListNode lastNode=head;
		
		while(lastNode.nextNode!=null)
			lastNode=lastNode.nextNode;
		
		lastNode.nextNode=head.nextNode.nextNode;
		
		SingleLinkedListNode firstPointer=head, secondPointer=head;
		
		if(firstPointer==null || firstPointer.nextNode==null)
			return;
		
		while(secondPointer!=null && secondPointer.nextNode!=null){
			firstPointer=firstPointer.nextNode;
			secondPointer=secondPointer.nextNode.nextNode;
			
			if(firstPointer==secondPointer){
				System.out.print("Loop Found");
				break;
			}
				
		}
		
		firstPointer=head;
		
		while(firstPointer!=secondPointer){
			firstPointer=firstPointer.nextNode;
			secondPointer=secondPointer.nextNode;
		}
		
		System.out.println(firstPointer.value);
		
		if(secondPointer==null || secondPointer.nextNode==null)
			System.out.print("No Loop Found");
		
	}
	
	public static void palindrome(){
		SingleLinkedListNode firstPointer=head, secondPointer=head, previousNode = null;
		
		while(secondPointer!=null && secondPointer.nextNode!=null)
		{
			previousNode=firstPointer;
			firstPointer=firstPointer.nextNode;
			secondPointer=secondPointer.nextNode.nextNode;
		}
		
		previousNode.nextNode=null;
		
		if(secondPointer!=null)
			head2=firstPointer;
		
		if(secondPointer.nextNode!=null)
			head2=firstPointer.nextNode;
		
		head2=reverseRecursive(head2);
		
		firstPointer=head; secondPointer=head2;
		
		while(firstPointer!=null && secondPointer!=null){
			if(firstPointer.value==secondPointer.value){
				System.out.println(firstPointer.value+"     "+secondPointer.value);
				firstPointer=firstPointer.nextNode;
				secondPointer=secondPointer.nextNode;
			}else{
				System.out.println("Failed");
				break;
			}
		}
	}
	
	public static void removeDuplicatesSortedList(){
		SingleLinkedListNode previousNode=head, currentNode=previousNode;
		while(currentNode!=null){
			if(currentNode.value==previousNode.value){
				SingleLinkedListNode tempNode=currentNode.nextNode;
				previousNode.nextNode=currentNode.nextNode;
				currentNode=tempNode;
			}else{
				previousNode=currentNode;
				currentNode=currentNode.nextNode ;
			}
				
		}
		
	}
	
	public static void removeDuplicatesUnsortedLinkedList(){
		SingleLinkedListNode previousNode = null, currentNode=head;
		HashMap<Integer, Boolean> temp=new HashMap<Integer, Boolean>();
		
		while(currentNode!=null){
			if(temp.get(currentNode.value)==null){
				temp.put(currentNode.value,true);
				previousNode=currentNode;
				
			}else
				previousNode.nextNode=currentNode.nextNode;
			currentNode=currentNode.nextNode ;
		}
		
	}
	
	public static void iterativePairWiseSwap(){
		SingleLinkedListNode oneNode = head;
		
		while(oneNode!=null && oneNode.nextNode!=null){
				swap(oneNode, oneNode.nextNode);
				oneNode=oneNode.nextNode.nextNode;
		}
	}
	
	public static void recursivePairWiseSwap(SingleLinkedListNode oneNode){
		if(oneNode!=null && oneNode.nextNode!=null){
			swap(oneNode, oneNode.nextNode);
			recursivePairWiseSwap(oneNode.nextNode.nextNode);
		}
	}
	
	public static void swap(SingleLinkedListNode node1, SingleLinkedListNode node2){
		int temp=node1.value;
		node1.value=node2.value;
		node2.value=temp;
	}
	
	public static void intersectionOfLinkedLists(){
		SingleLinkedListNode firstListNode=head, secondListNode=head2;
		while(firstListNode !=null && secondListNode!=null){
			System.out.println(firstListNode.value+"     "+secondListNode.value);
			if(firstListNode.value == secondListNode.value){
				
				SingleLinkedListNode newNode=new SingleLinkedListNode(firstListNode.value);
				if(head3==null){
					head3=newNode;
				}else{
					newNode.nextNode=head3;
					head3=newNode;
				}
				firstListNode=firstListNode.nextNode;
				secondListNode=secondListNode.nextNode;
			}
			else if(firstListNode.value < secondListNode.value)
				firstListNode=firstListNode.nextNode;
			else if(firstListNode.value > secondListNode.value)
				secondListNode=secondListNode.nextNode;
		}
		
	}
	
	
	public static void deleteAlternateNodes(){
		SingleLinkedListNode firstListNode=head;
		while(firstListNode!=null && firstListNode.nextNode!=null){
			firstListNode.nextNode=firstListNode.nextNode.nextNode;
			firstListNode=firstListNode.nextNode;
		}
	}
	
	public static void alternateSplit(){
		SingleLinkedListNode firstListNode=head;
		while(firstListNode!=null && firstListNode.nextNode!=null){
			
			SingleLinkedListNode newNode=new SingleLinkedListNode(firstListNode.value);
			if(head2==null){
				head2=newNode;
			}else{
				newNode.nextNode=head2;
				head2=newNode;
			}
			
			SingleLinkedListNode newNode2=new SingleLinkedListNode(firstListNode.nextNode.value);
			if(head3==null){
				head3=newNode2;
			}else{
				newNode2.nextNode=head3;
				head3=newNode2;
			}
			
			firstListNode=firstListNode.nextNode.nextNode;
		}
		
		if(firstListNode!=null){
			SingleLinkedListNode newNode=new SingleLinkedListNode(firstListNode.value);
			if(head2==null){
				head2=newNode;
			}else{
				newNode.nextNode=head2;
				head2=newNode;
			}
		}
			
	}
	
	public static void mergeTwoSortedLists(){
		SingleLinkedListNode firstListNode=head, secondListNode=head2;
		
		
		
		while(firstListNode !=null && secondListNode!=null){
			SingleLinkedListNode newNode=null;
			if(firstListNode.value <= secondListNode.value){
				newNode=new SingleLinkedListNode(firstListNode.value);
				firstListNode=firstListNode.nextNode;
			}
			else if(firstListNode.value > secondListNode.value){
				newNode=new SingleLinkedListNode(secondListNode.value);
				secondListNode=secondListNode.nextNode;
			}
			
			if(head3==null){
				head3=newNode;
			}else{
				newNode.nextNode=head3;
				head3=newNode;
			}
		}
		
		while(firstListNode !=null){
			SingleLinkedListNode newNode=new SingleLinkedListNode(firstListNode.value);
			if(head3==null){
				head3=newNode;
			}else{
				newNode.nextNode=head3;
				head3=newNode;
			}
			firstListNode=firstListNode.nextNode;
		}
		
		while(secondListNode !=null){
			SingleLinkedListNode newNode=new SingleLinkedListNode(secondListNode.value);
			if(head3==null){
				head3=newNode;
			}else{
				newNode.nextNode=head3;
				head3=newNode;
			}
			secondListNode=secondListNode.nextNode;
		}
	}

	
	public static SingleLinkedListNode reverseLinkedListOfSize(SingleLinkedListNode temp,int size){
		//System.out.println("dsds"+temp.value);
		SingleLinkedListNode prev=null, current=temp, next=null;
		int count=0;
		while(current!=null && count<size){
			next=current.nextNode;
			current.nextNode=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next!=null){
			temp.nextNode=reverseLinkedListOfSize( next, size);
		}
		return prev;
	}
	
	public static SingleLinkedListNode alternateReverseLinkedListOfSize(SingleLinkedListNode temp,int size){
		SingleLinkedListNode prev=null, current=temp, next=null;
		int count=0;
		while(current!=null && count<size){
			next=current.nextNode;
			current.nextNode=prev;
			prev=current;
			current=next;
			count++;
		}
		
		count=0;
		
		if(current!=null)
			temp.nextNode=current;
		
		while(count < size-1 && current!=null){
			current=current.nextNode;
			count++;
		}
		if(current!=null){
			current.nextNode=alternateReverseLinkedListOfSize( current.nextNode, size);
		}
		return prev;
	}
	
	public static void deleteGreaterNumbersOnRight(){
		reverseIterative();

		SingleLinkedListNode node=head, prev = null;
		int max=0;
		
		while(node!=null){
			if(node.value>max){
				max=node.value;
				prev=node;
			}else{
				prev.nextNode=prev.nextNode.nextNode;
			}
			node=node.nextNode;
		}
		
	}
	
	public static void segregateEvenOdd(){
		SingleLinkedListNode node=head, backPtr=head, prev=null, stopNode=null;
		
		while(backPtr.nextNode!=null)
			backPtr=backPtr.nextNode;
		
		stopNode=backPtr;
		
		while(node.value%2 !=0 && node!=backPtr){
			System.out.println("odd"+node.value);
			stopNode.nextNode=node;
			node=node.nextNode;
			stopNode.nextNode.nextNode=null;
			stopNode=stopNode.nextNode;
		}
		
		if(node.value%2 ==0){
			head=node;
			while(node!=backPtr){
				if(node.value%2 == 0){
					System.out.println(node.value);
					prev=node;
					node=node.nextNode;
				}else{
					prev.nextNode=node.nextNode;
					node.nextNode=null;
					stopNode.nextNode=node;
					stopNode=node;
					node=prev.nextNode;
				}
			}
		}else
			prev=node;
	
		if(node.value%2 !=0 && backPtr!=stopNode){
			prev.nextNode=backPtr.nextNode;
			backPtr.nextNode=null;
			stopNode.nextNode=backPtr;
		}
	
	}
	
	public static void addTwoNumbers(){
		SingleLinkedListNode firstNode=head, secondNode=head2;
		int a=0, total=0, c=0;
		
		while(firstNode!=null && secondNode!=null){
			total=firstNode.value+secondNode.value+a;
			c=total%10;
			a=total/10;
			
			firstNode.value=c;

			
			firstNode=firstNode.nextNode;
			secondNode=secondNode.nextNode;
		}
		
		while(firstNode!=null){
			total=firstNode.value+a;
			c=total%10;
			a=total/10;
			firstNode.value=c;
			firstNode=firstNode.nextNode;
		}
	}
	
	public static void unionIntersection(){
		SingleLinkedListNode firstNode=head, secondNode=head2;
		HashMap<Integer,Boolean> statusCheck=new HashMap<Integer,Boolean>();
		
		
		//union
		while(firstNode!=null){
			if(statusCheck.get(firstNode.value)==null){
				statusCheck.put(firstNode.value, true);
				//insert in linked list
			}
		}
		
		while(secondNode!=null){
			if(statusCheck.get(secondNode.value)==null){
				//insert in linked list
			}
		}
		
		//intersection
		while(firstNode!=null){
			if(statusCheck.get(firstNode.value)==null){
				statusCheck.put(firstNode.value, true);
			}
		}
		
		while(secondNode!=null){
			if(statusCheck.get(secondNode.value)==true){
				//insert in linked list
			}
		}	
	}
	
	public static void findingTriplet(int number){
		SingleLinkedListNode firstNode=head, secondNode=head2, thirdNode=head3;
	
		while(firstNode!=null){
			secondNode=head2;
			thirdNode=head3;
			while(secondNode!=null && thirdNode!=null){
				int total=firstNode.value+secondNode.value+thirdNode.value;
				if(total == number){
					System.out.println(firstNode.value+"  "+secondNode.value+"  "+thirdNode.value);
					return;
				}
				else if(total>number)
					thirdNode=thirdNode.nextNode;
				else
					secondNode=secondNode.nextNode;
			}
			firstNode=firstNode.nextNode;
		}
	}
	
	public static void rotateLinkedList(int size){
		SingleLinkedListNode firstNode=head, newHead;
		int count =1;
		
		while(count<size){
			firstNode=firstNode.nextNode;
			count++;
		}
		
		SingleLinkedListNode next=firstNode.nextNode;
		newHead=firstNode.nextNode;
		firstNode.nextNode=null;
		
		while(next.nextNode!=null){
			next=next.nextNode;
		}
		next.nextNode=head;
		head=newHead;
		
	}
	
	public static void sortZerosOneTwo(){
		SingleLinkedListNode firstNode=head;
		int zeroCount=0, oneCount=0, twoCount=0;
		
		while(firstNode!=null){
			if(firstNode.value==0)
				zeroCount++;
			else if(firstNode.value==1)
				oneCount++;
			else if(firstNode.value==2)
				twoCount++;
			firstNode=firstNode.nextNode;
		}
		firstNode=head;
		while(firstNode!=null){
			if(zeroCount!=0){
				firstNode.value=0;
				zeroCount--;
			}else if(oneCount!=0){
				firstNode.value=1;
				oneCount--;
			}else if(twoCount!=0){
				firstNode.value=2;
				twoCount--;
			}
			firstNode=firstNode.nextNode;
		}
		
	}
	
	public static void deleteNnodeAfterMnodes(int m, int n){
		SingleLinkedListNode firstNode=head, temp;
		int count;
		while(firstNode!=null){
			for(count=1; count<m && firstNode!=null; count++)
				firstNode=firstNode.nextNode;
			
			if(firstNode==null)
				return;
			
			temp=firstNode.nextNode;
			
			for(count=1; count<=n && temp!=null; count++)
				temp=temp.nextNode;
			
			firstNode.nextNode=temp;
			firstNode=temp;
		}
	}
	
	public static void addTwoNumbersExtension(SingleLinkedListNode first, SingleLinkedListNode second){
		
	}
	
	public static void flattenMultiLevelLinkedList(){
		SingleLinkedListNode firstNode=head, backPtr=head, temp;
		
		while(backPtr.nextNode!=null)
			backPtr=backPtr.nextNode;
		
		while(firstNode!=backPtr){
			if(firstNode.downNode!=null){
				backPtr.nextNode=firstNode.downNode;
			//update tail
			temp=firstNode.downNode;
			while(temp.nextNode!=null)
				temp=temp.nextNode;
			backPtr=temp;
		}
		firstNode=firstNode.nextNode;
		}
	}
	
	public static void mergeLinkedListAtAlternatePositions(){
		SingleLinkedListNode firstNode=head, secondNode=head2, tempNode, bufferNode;
		//int size1=0, size2=0;
		
//		while(firstNode!=null){
//			size1++;
//			firstNode=firstNode.nextNode;
//		}
//		
//		while(secondNode!=null){
//			size2++;
//			secondNode=secondNode.nextNode;
//		}
//		
//		firstNode=head; secondNode=head2;
//		tempNode=(size1>size2)? firstNode: secondNode;
		
		while(firstNode!=null && secondNode!=null){
			bufferNode=firstNode.nextNode;
			tempNode=secondNode;
			firstNode.nextNode=tempNode;
			tempNode.nextNode=bufferNode;
			
			secondNode=secondNode.nextNode;
			firstNode=firstNode.nextNode.nextNode;
		}
	}
	
	public static SingleLinkedListNode pairWiseSwapWithLinks(SingleLinkedListNode node1){
		SingleLinkedListNode current=node1, prev=null,next=null;
		int count=0;
		while(current!=null && count < 2){
			next=current.nextNode;
			current.nextNode=prev;
			prev=current;
			current=next;
			count++;
		}
		
		if(next!=null)
			node1.nextNode=pairWiseSwapWithLinks(next);
		
			return prev;
	}
	
	public static void lineSegments(){
		//check the direction first
		//while loop and delete the nodes in the same axis
		//recursive by deleting the next nodes and adding the remaining to head
		SingleLinkedListNode current=head;
		if(current==null || current.nextNode==null || current.nextNode.nextNode==null)
			return;
		
		SingleLinkedListNode next=current.nextNode, nextNext=next.nextNode;
		
		if(next.value==current.value){
			while(nextNext!=null && nextNext.value==next.value){
				//delete next with reference to head
				next=nextNext;
				nextNext=nextNext.nextNode;
			}
		}
		//same snippet for y coordinate
		
		//recursive(head.next)
		
	}
	
	public static void cloneList(){
		SingleLinkedListNode current=head, cloneNode;
		HashMap<SingleLinkedListNode, SingleLinkedListNode> cloneMap=new HashMap<SingleLinkedListNode, SingleLinkedListNode>();
		
		while(current!=null){
			cloneNode=new SingleLinkedListNode(current.value);
			cloneMap.put(current, cloneNode);
			current=current.nextNode;
		}
		
		current=head;
		
		while(current!=null){
			cloneNode=cloneMap.get(current);
			cloneNode.nextNode=cloneMap.get(current.nextNode);
			cloneNode.downNode=cloneMap.get(current.downNode);
			cloneMap.put(current, cloneNode);
			current=current.nextNode;
		}
		
	}
	
	
	public static SingleLinkedListNode MergeSort1(SingleLinkedListNode headOriginal){
		if(headOriginal==null || headOriginal.nextNode==null)
			return headOriginal;
		
		SingleLinkedListNode slowPtr=headOriginal, fastPtr=headOriginal.nextNode;
		
		while( fastPtr!=null && fastPtr.nextNode!=null){
			headOriginal=headOriginal.nextNode;
			fastPtr=fastPtr.nextNode.nextNode;
		}
		fastPtr=headOriginal.nextNode;
		headOriginal.nextNode=null;
		
		return merge2(MergeSort1(slowPtr), MergeSort1(fastPtr));
	}
	
	public static SingleLinkedListNode merge2(SingleLinkedListNode a, SingleLinkedListNode b){
		SingleLinkedListNode temp=new SingleLinkedListNode();
		//SingleLinkedListNode head20=temp;
		SingleLinkedListNode c=temp;
		
		while(a!=null && b!=null){
			if(a.value<=b.value){
				c.nextNode=a;
				c=a;
				a=a.nextNode;
			}else{
				c.nextNode=b;
				c=b;
				b=b.nextNode;
			}
		}
		c.nextNode= (a==null)?b:a;
		return temp.nextNode;
	}
	
	public static SingleLinkedListNode implementingMergeSortAgain(SingleLinkedListNode node){
		if(node==null || node.nextNode==null)
			return node;
		
		SingleLinkedListNode slowPtr=node, fastPtr=node.nextNode;
		
		while(fastPtr!=null && fastPtr.nextNode!=null){
			node=node.nextNode;
			fastPtr=fastPtr.nextNode.nextNode;
		}
		
		fastPtr=node.nextNode;
		node.nextNode=null;
		
		return mergeAgain(implementingMergeSortAgain(slowPtr), implementingMergeSortAgain(fastPtr));
	}
	
	public static SingleLinkedListNode mergeAgain(SingleLinkedListNode a, SingleLinkedListNode b){
		
		SingleLinkedListNode newNode=new SingleLinkedListNode();
		SingleLinkedListNode temp=newNode;
		SingleLinkedListNode c=temp;
		
		while(a!=null && b!=null){
			if(a.value<=b.value){
				c.nextNode=a;
				c=a;
				a=a.nextNode;
			}
			else{
				c.nextNode=b;
				c=b;
				b=b.nextNode;
			}
		}
		
		c.nextNode=(a==null)?b:a;
		
		return temp.nextNode;
	}
	
	public static SingleLinkedListNode maximumSumCoordinates(SingleLinkedListNode a, SingleLinkedListNode b){
		SingleLinkedListNode pre1=a, curr1=a, pre2=a, curr2=b, result=null;
		while(curr1!=null || curr2!=null){
			int sum1=0, sum2=0;
			while(curr1!=null && curr2!=null && curr1.value!=curr2.value){
				if(curr1.value<curr2.value){
					sum1=sum1+curr1.value;
					curr1=curr1.nextNode;
				}else{
					sum2=sum2+curr2.value;
					curr2=curr2.nextNode;
				}
			}
			
			//check null of curr1 curr2
			if(curr1==null){
				while(curr2!=null){
					sum2=sum2+curr2.value;
					curr2=curr2.nextNode;
				}
			}
			
			if(curr2==null){
				while(curr1!=null){
					sum1=sum1+curr1.value;
					curr1=curr1.nextNode;
				}
			}
			
			if(pre1==a && pre2==b)
				result=(sum1>sum2) ? pre1:pre2;
			else{
				if(sum1>sum2)
					pre2.nextNode=pre1.nextNode;
				else
					pre1.nextNode=pre2.nextNode;
			}
			
			pre1=curr1; pre2=curr2;
			
			if(curr1!=null)
				curr1=curr1.nextNode;
			if(curr2!=null)
				curr2=curr2.nextNode;
		}
		
		return result;
	}
	
	public static SingleLinkedListNode merge2LinkedLists(SingleLinkedListNode head1, SingleLinkedListNode head2){
		SingleLinkedListNode head3=null, end=null;
		
		while(head1!=null || head2!=null){
			
			SingleLinkedListNode newNode=new SingleLinkedListNode();
		
			if(head1!=null && head2!=null){
				if(head1.value <= head2.value){
					newNode.value=head1.value;
					head1=head1.nextNode;
				}else{
						newNode.value=head2.value;
						head2=head2.nextNode;
				}	
			}else if(head1!=null){
				newNode.value=head1.value;
				head1=head1.nextNode;
			}else if(head2!=null){
				newNode.value=head2.value;
				head2=head2.nextNode;
			}
			
			
			if(head3==null){
				head3=newNode;
			}
			
			if(end==null)
				end=newNode;
			else{
				end.nextNode=newNode;
			}
			end=newNode;
			
		}
		
		
		return head3;
	}
	
		public static void main(String args[]){
			insertBeginningForHead(7);
			insertBeginningForHead(3);
			insertBeginningForHead(1);
//			insertBeginningForHead(43);
//			insertBeginningForHead(5);
//			insertBeginningForHead(61);
			
			insertBeginningForHead2(8);
			insertBeginningForHead2(5);
			insertBeginningForHead2(2);
			
			head=merge2LinkedLists(head, head2);
			
		
//			
//			
//			insertBeginningForHead3(6);
//			insertBeginningForHead3(5);
//			insertBeginningForHead3(4);
			
			//head=pairWiseSwapWithLinks(head);
			//head=reverseLinkedListOfSize(head,2);
			display(head);
			//display(head2);
			//display(head);
		}	
}
