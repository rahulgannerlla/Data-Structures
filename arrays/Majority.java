package arrays;

public class Majority {
	
	public void majorityElement(){
		int tempArray[]=new int[]{2,3,1,4,2,5,2};
		int maxIndex=0, count=1;
		for(int i=1; i<tempArray.length; i++){
			if(tempArray[maxIndex]==tempArray[i])
				count++;
			else
				count--;
			if(count==0){
				maxIndex=i;
				count=1;
			}
		}
		count=0;
		for(int i=0; i<tempArray.length; i++){
			if(tempArray[i]==tempArray[maxIndex])
				count++;
		}
		if(count>tempArray.length/2)
			System.out.println(tempArray[maxIndex]);
		else
			System.out.println("None");
	}
	
 public static void main(String args[]){
	 Majority majority=new Majority();
	 majority.majorityElement();
 }
}
