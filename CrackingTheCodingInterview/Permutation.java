package CrackingTheCodingInterview;

public class Permutation {
	public static void main(String args[]){
		
		String s1="rahul", s2="luhar";
		boolean result=true;
		
		int asciArray[]=new int[256];
		
		for(int i=0; i<s1.length(); i++){
			asciArray[s1.charAt(i)]++;
		}
		
		for(int i=0; i<s2.length(); i++){
			//System.out.println(asciArray[s2.charAt(i)]);
			asciArray[s2.charAt(i)]--;
			if(asciArray[s2.charAt(i)]==-1){
				result=false;
				break;
			}
		}
		
		System.out.println(result);
	}
}
