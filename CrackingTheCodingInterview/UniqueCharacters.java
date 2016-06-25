package CrackingTheCodingInterview;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean result= true;
		String temp="rahul";
		int asciArray[]=new int[256];
		
		for(int i=0; i<temp.length(); i++){
			if(asciArray[temp.charAt(i)]==0)
				asciArray[temp.charAt(i)]++;
			else{
				result=false;
			}
		}
		System.out.println(result);
	}

}
