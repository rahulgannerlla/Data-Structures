package arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class AttackerDefender {
	
	
	public void generateDependentEntitiesMap(){
		HashMap<String, HashSet<String>> dMap = new HashMap<String, HashSet<String>>();
		ArrayList<String> inputList=new ArrayList<String>();
		
		try{
	          FileReader inputFile = new FileReader("/Users/rgannerl/Documents/workspace/FullTime/src/arrays/input");
	          BufferedReader bufferReader = new BufferedReader(inputFile);

	          String line;
	          while ((line = bufferReader.readLine()) != null){
	        	  
	        	 // System.out.println(line);
	        	  
	      		String [] a = line.split("<-");
	      		if(!inputList.contains(a[0].trim()))
	      			inputList.add(a[0].trim());
	      		
	      		String [] b = a[1].split("&");
	      		
	      		for(int j=0; j<b.length; j++){
	      			
	      			if(!inputList.contains(b[j].trim()))
		      			inputList.add(b[j].trim());
	      			
	      			HashSet<String> dSet;
	      			if(dMap.containsKey(b[j]))
	      				dSet = dMap.get(b[j]);
	      			else
	      				dSet = new HashSet<String>();
	      				
	      			dSet.add(a[0]);
	      			dMap.put(b[j], dSet);
	      		} 
	          }
	          bufferReader.close();
	          System.out.println("mmm");
	          computePayOffMatrix(dMap, inputList);
	       }catch(Exception e){
	          System.out.println("Error while reading file line by line:" + e.getMessage());                      
	       }
	}
	
	public void computePayOffMatrix(HashMap<String, HashSet<String>> dMap, ArrayList<String> inputList){
		 String[] defenderArray=inputList.toArray(new String[inputList.size()]);
         String[] attackerArray=inputList.toArray(new String[inputList.size()]);
         String[][] payOffMatrix=new String[attackerArray.length][attackerArray.length];
         Queue<String> queue=new LinkedList<String>();
         
         System.out.println("Order of entities in payoff matrix");
         System.out.println();
         
         for(String s1: defenderArray)
       	  System.out.print(s1.trim()+" ");
         System.out.println();
         
         for(int i=0; i<defenderArray.length; i++){
       	  for(int j=0; j<attackerArray.length; j++){
       		  if(i==j){
       			  payOffMatrix[i][j]="0/"+ defenderArray.length;
       		  }else{
       			  HashSet<String> cSet = new HashSet<String>();
 	  	      			queue.add(attackerArray[i]);
 	  	      		while(!queue.isEmpty()){
 	  	      			String c = queue.remove();
 	  	      			if(!cSet.contains(c)){
 	  	      				cSet.add(c);
 	  	      				
 	  	      				if(dMap.containsKey(c)){
 	  	      				HashSet<String> dependentEntities = dMap.get(c);
 	  	      				for(String temp: dependentEntities)
 	  	      					if(!temp.equals(attackerArray[j]))
 	  	      						queue.add(temp);
 	  	      				}
 	  	      			}
 	  	      		}
 	  	      	payOffMatrix[i][j]=cSet.size() + "/" + (attackerArray.length - cSet.size());
       		  }
       	  }
         }
         
         for(int i=0; i<attackerArray.length; i++){
       	  for(int j=0; j<attackerArray.length; j++){
       		  System.out.print(payOffMatrix[i][j]+"   ");
       	  }
       	  System.out.println();
         } 
	}
	
	public static void main(String[] args){
		AttackerDefender attackerDefender=new AttackerDefender();
		attackerDefender.generateDependentEntitiesMap();
	}
}
