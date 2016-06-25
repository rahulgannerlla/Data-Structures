package arrays;

public class HeapsUsingArrays {

	int a[]=new int[30];
	int capacity;
	
	HeapsUsingArrays(){
		capacity=0;
	}
	
	public void insertNode(int x){
		a[capacity] = x;
		trickleUp(capacity++);
	}
	
	public void trickleUp(int index){
		int bottom = a[index];
		int parent = (index-1)/2;
		
		while(index >0 && a[parent] < bottom){
			a[index] = a[parent];
			index = parent;
			parent=(parent-1)/2;
		}
		a[index] = bottom;
	}
	
	public int removeNode(){
		
		//System.out.println(" capacity "+ capacity+" "+a[0]);
		int top = a[0];
		a[0] = a[--capacity];
		//System.out.println(" capacity "+ capacity+" "+ a[capacity]);
		trickleDown(0);
		return top;
	}
	
	public void trickleDown(int index){
		int largerChild;
		int top = a[index];
		
		while(index < capacity/2){
			int lc = 2*index+1;
			int rc = 2*index+2;
			
			if(rc < capacity && a[lc] < a[rc])
				largerChild = rc;
			else
				largerChild = lc;
			
			if(top > a[largerChild])
				break;
			
			a[index] = a[largerChild];
			index = largerChild;
		}
		a[index] = top;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HeapsUsingArrays h = new HeapsUsingArrays();
		h.insertNode(3);
		h.insertNode(4);
		h.insertNode(1);
		h.insertNode(8);
		h.insertNode(5);
		
		System.out.println(h.removeNode());
		System.out.println(h.removeNode());
		System.out.println(h.removeNode());
		System.out.println(h.removeNode());
		System.out.println(h.removeNode());
	}

}
