package bst;

public class CheckIfOnlyOneChild {
	
	public boolean onlyOneChild(){
		int[] temp=new int[]{2,1,3};
		int min, max;
		
		if(temp[temp.length-2]>temp[temp.length-1]){
			min=temp[temp.length-1];
			max=temp[temp.length-2];
		}else{
			min=temp[temp.length-2];
			max=temp[temp.length-1];
		}
		
		for(int i=temp.length-3; i>=0;i--){
			if(temp[i]<min)
				min=temp[i];
			else if(temp[i]>max)
				max=temp[i];
			else
				return false;
		}
		return true;
	}
	
	
	public static void main(String args[]){
		
		CheckIfOnlyOneChild c=new CheckIfOnlyOneChild();
		System.out.println(c.onlyOneChild());
	}
}
