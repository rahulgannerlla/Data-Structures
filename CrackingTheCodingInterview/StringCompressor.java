package CrackingTheCodingInterview;

public class StringCompressor {
	public static void main(String args[]){
		String temp = "sbbbccffsasaa";
		StringBuilder sb=new StringBuilder();
		char tempChar[]=temp.toCharArray();
		int count=1, i=0;
		
		for(; i<temp.length()-1; i++){
			if(tempChar[i]==tempChar[i+1]){
				count++;
			}else{
				sb.append(tempChar[i]);
				sb.append(count);
				count=1;
			}
		}
		
		sb.append(tempChar[i]);
		sb.append(count);
		System.out.println(sb.toString());
	}
}
