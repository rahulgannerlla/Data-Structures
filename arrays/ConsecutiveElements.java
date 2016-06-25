package arrays;

public class ConsecutiveElements {
	
	public void consecutive(){
		int a[]=new int[]{5,2,3,8,4};
		int max=a[0], min=a[0];
		
		for(int i=1; i<a.length-1; i++){
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		
		if(max-min+1 == a.length){
			boolean visited[]=new boolean[a.length];
			for(int i=0; i<a.length; i++){
				if(visited[a[i]-min] != false){
					System.out.println("not consecutive");
					break;
				}
				visited[a[i]-min]=true;
			}
			System.out.println("consecutive");
		}else
			System.out.println("not consecutive");
	}
	
	public static void main(String args[]){
		ConsecutiveElements consecutiveElements=new ConsecutiveElements();
		consecutiveElements.consecutive();
	}
}
