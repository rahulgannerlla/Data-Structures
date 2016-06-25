package CrackingTheCodingInterview;

public class ReplaceSpaceWith20 {
	public static void main(String args[]){
		
		String temp = "Ra hu l ";
		int spaceCount=0;
		
		for(int i=0; i<temp.length(); i++){
			if(temp.charAt(i)==' ')
				spaceCount++;
		}
		
		if(spaceCount==0)
			return;
		
		int j=temp.length()+2*spaceCount;
		char str[]=new char[j];

		for(int i=temp.length()-1; i>=0; i--){
			if(temp.charAt(i)==' '){
				
				System.out.println(j);
				str[j-1]='%';
				str[j-2]='0';
				str[j-3]='2';
				j=j-3;
			}else{
				str[j-1]=temp.charAt(i);
				j=j-1;
			}
		}
		
		for(int i=0; i<str.length; i++)
			System.out.print(str[i]);
	}
}
