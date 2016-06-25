package arrays;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency {
	int a[];
	Frequency(){
		a=new int[]{2,5,2,8,5,6,8,8};
	}
	
	public void frequencyCount(){
		HashMap<Integer, Integer> freqCount=new HashMap<Integer, Integer>();
		for(int i:a){
			if(freqCount.get(i)==null)
				freqCount.put(i, 1);
			else
				freqCount.put(i, freqCount.get(i)+1);
		}

		List<Entry<Integer, Integer>> list=new ArrayList<Entry<Integer, Integer>>(freqCount.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
	}
	
	
	
	public static void main(String args[]){
		
	}
}
