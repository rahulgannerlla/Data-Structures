package arrays;

import java.util.HashMap;

public class LRUCache {
	HashMap<Integer, dllNode> map=new HashMap<Integer, dllNode>();
	dllNode head=null, end=null;
	int capacity =4;
	
	public  void remove(dllNode n){
		if(n.pre!=null){
			n.pre.next=n.next;
		}else{
			head = n.next;
		}
		
		if(n.next!=null){
			n.next.pre=n.pre;
		}else{
			end=n.pre;
		}
	}
	
	public  void insert(int key, int value){
		if(map.containsKey(key)){
			dllNode old=map.get(key);
			old.value=value;
			remove(old);
			setHead(old);
		}else{
			dllNode node=new dllNode(key, value);
			if(map.size()>=capacity){
				map.remove(end.key);
				remove(end);
			}
			setHead(node);
			map.put(key, node);
		}
	}
	
	public  void setHead(dllNode n){
		n.next=head;
		//System.out.println(n.value);
		if(head!=null)
			head.pre=n;
		
		head=n;
		
		if(end==null)
			end=head;
			
	}
	
	public  int getKey(int key){
		if(map.containsKey(key)){
			dllNode old=map.get(key);
			remove(old);
			setHead(old);
			return old.value;
		}
		return -1;
	}
	
	public static void main(String args[]){
		LRUCache lruc=new LRUCache();
		lruc.insert(1,1);
		lruc.insert(2,2);
		lruc.insert(3,3);
		lruc.insert(4,4);
		
		dllNode node=lruc.head;
		
		while(node!=null){
			System.out.print(node.value+"  ");
			node=node.next;
		}
		System.out.println();
		
		
		lruc.insert(5,5);
		node=lruc.head;
		while(node!=null){
			System.out.print(node.value+"  ");
			node=node.next;
		}
		System.out.println();
		
		
		lruc.insert(4,6);
		node=lruc.head;
		while(node!=null){
			System.out.print(node.value+"  ");
			node=node.next;
		}
		System.out.println();
	}
}
