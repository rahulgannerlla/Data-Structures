package arrays;

public class ArrayContainer implements Comparable<ArrayContainer>{
	int arr[];
	int index;
	
	public ArrayContainer(int arr[], int index){
		this.arr=arr;
		this.index=index;
	}

	public int compareTo(ArrayContainer o){
		
		if(this.arr[this.index]>o.arr[o.index])
			return 1;
		else if(this.arr[this.index]< o.arr[o.index])
			return -1;
		else
			return 0;
	}
	
	
}
