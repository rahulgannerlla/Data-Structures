package arrays;

public class MaxLengthBiotonic {
	
	public void lengthBiotonic(){
		int a[]=new int[]{12, 4, 78,90,45,23};
		
		int incAux[]=new int[a.length];
		int excAux[]=new int[a.length];
		
		incAux[0]=1;
		for(int i=1; i<a.length; i++){
			if(a[i]>a[i-1]){
				incAux[i]=incAux[i]+1;
			}else
				incAux[i]=1;
		}
		
		excAux[a.length-1]=1;
		for(int i=a.length-2; i>=0; i--){
			if(a[i]>a[i+1]){
				excAux[i]=excAux[i]+1;
			}else
				excAux[i]=1;
		}
		
		//calculate the max value by taking the excAux and incAux difference
		
	}
	
	public static void main(String args[]){
		
	}
}
