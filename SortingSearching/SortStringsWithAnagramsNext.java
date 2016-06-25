package SortingSearching;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringsWithAnagramsNext {

	public static String sortString(String s){
		char c[]=s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s=new String[]{"cat", "dog", "tac","god", "water"};
		
		Arrays.sort(s, new Comparator<String>() {
			public int compare(String s1, String s2){
				return sortString(s1).compareTo(sortString(s2));
			}
		});
		
		for(String e:s){
			System.out.print(e + "  ");
		}
	}

}
