package arrays;

public class MinDistance {
	
	public void minimum(int x, int y){
		int a[]=new int[]{3,5,4,2,6,5,6,6,5,4,8,3};
		int prev = 0, minD=-1;
		int i=0;
		for(; i<a.length; i++){
			if(a[i]==x || a[i]==y) {
				prev=i;
				break;
			}
		}
		
		System.out.println(i);
		
		for(;i<a.length;i++){
			if(a[i]==x || a[i]==y){
				if(a[i]!=a[prev] && (i-prev>minD)){
					minD=i-prev;
					prev=i;
				}else
					prev=i;
			}
		}
		
		System.out.println(minD);
	}
	
	public static void main(String args[]){
		MinDistance minDistance=new MinDistance();
		minDistance.minimum(3, 6);
	}
}
