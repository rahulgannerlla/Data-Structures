package SortingSearching;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String>{
	
	public String sortString(String s){
		char c[]=s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
	public int compare(String s1, String s2){
		return sortString(s1).compareTo(sortString(s2));
	}
	
}
