package arrays;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
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
	          
	          computePayOffMatrix(dMap, inputList);
	       }catch(Exception e){
	          System.out.println("Error while reading file line by line:" + e.getMessage());                      
	       }
	}
	
	public void computePayOffMatrix(HashMap<String, HashSet<String>> dMap, ArrayList<String> inputList){
		 String[] defenderArray=inputList.toArray(new String[inputList.size()]);
         String[] attackerArray=inputList.toArray(new String[inputList.size()]);
         
         int[][] eq1=new int[attackerArray.length][attackerArray.length];
         double[][] tempEq1=new double[attackerArray.length][attackerArray.length];
         
         int[][] eq2=new int[attackerArray.length][attackerArray.length];
         
         Queue<String> queue=new LinkedList<String>();
         
         System.out.println("Order of entities in payoff matrix");
         System.out.println();
         
         for(String s1: defenderArray)
       	  System.out.print(s1+" ");
         System.out.println();
         
         for(int i=0; i<defenderArray.length; i++){
       	  for(int j=0; j<attackerArray.length; j++){
       		  if(i==j){
       			  eq1[i][j]=0;
       			  eq2[i][j]=defenderArray.length;
       		  }else{
       			  HashSet<String> cSet = new HashSet<String>();
 	  	      			queue.add(defenderArray[i]);
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
 	  	      	eq1[i][j]=cSet.size();
     			eq2[i][j]=attackerArray.length - cSet.size();
 	  	      	//payOffMatrix[i][j]=cSet.size() + "---" + (attackerArray.length - cSet.size());
       		  }
       	  }
         }
         
         for(int i=0; i<attackerArray.length; i++){
          	  for(int j=0; j<attackerArray.length; j++){
          		  System.out.print(eq1[i][j]+" ");
          	  }
          	  System.out.println();
            } 
         
         System.out.println();
         System.out.println();
         
//         for(int i=0; i<attackerArray.length; i++){
//        	 for(int j=0; j< attackerArray.length; j++){
//        		 if(i==attackerArray.length-1)
//        			 tempEq1[i][j]=eq2[i][j];
//        		 else if(eq2[attackerArray.length-1][j] > 0.0){
//    				 tempEq1[i][j]=eq2[i][j]-eq2[attackerArray.length-1][j];
//    			 }
//    			else if(eq2[j][attackerArray.length-1]<0.0){
//    				tempEq1[i][j]=eq2[i][j]+Math.abs(eq2[attackerArray.length-1][j]);
//    			}
//    		 }
//         }
//         
//         for(int i=0; i<attackerArray.length; i++){
//          	  for(int j=0; j<attackerArray.length; j++){
//          		  System.out.print(tempEq1[i][j]+"   ");
//          	  }
//          	  System.out.println();
//            } 
//         System.out.println();
//         System.out.println();
//         
//         
//         double[][] second=new double[attackerArray.length][attackerArray.length-1];
//         
//         for(int j=0; j<second[0].length; j++){
//          	  for(int i=0; i<second.length; i++){
//          		second[i][j]=tempEq1[i][j+1] - tempEq1[i][j];
//          	  }
//            } 
//         
//         
//         for(int i=0; i<second.length; i++){
//        	  for(int j=0; j<second[0].length; j++){
//        		  System.out.print(second[i][j]+"   ");
//        	  }
//        	  System.out.println();
//          } 
//       
//       System.out.println();
//       System.out.println();
////         
//         double[][] oneMore=new double[second[0].length][second[0].length];
////         double[][] second=new double[attackerArray.length-1][attackerArray.length-1];
////         
////         
////         System.out.println("test"+oneMore[0].length+ "  "+oneMore.length);
////         
//         for(int i=0; i<oneMore.length; i++){
//        	 for(int j=0; j< oneMore.length; j++){
//        		 oneMore[i][j]=second[j][i];
//        	 }
//         }
////         
////         for(int i=0; i<oneMore.length; i++){
////        	 for(int j=0; j< oneMore[0].length; j++){
////        		 second[i][j]=tempEq1[j][i];
////        	 }
////         }
////         
//         for(int i=0; i<oneMore.length; i++){
//         	  for(int j=0; j<oneMore.length; j++){
//         		  System.out.print(oneMore[i][j]+"  ");
//         	  }
//         	  System.out.println();
//           } 
//        System.out.println();
//        System.out.println();
////         
//         double temp[]=new double[]{0.0, 0.0, 0.0, 0.0, -1.0};
////         
//         RealMatrix coefficients = new Array2DRowRealMatrix(oneMore,true);
//         DecompositionSolver solver = new LUDecomposition(coefficients).getSolver();
//         RealVector constants = new ArrayRealVector(temp, false);
//         RealVector solution = solver.solve(constants);
//
//
////         for(int i=0; i<attackerArray.length; i++){
////       	  for(int j=0; j<attackerArray.length; j++){
////       		  System.out.print(tempEq1[i][j]+"   ");
////       	  }
////       	  System.out.println();
////         } 
//         
//         
////         System.out.println();
////         System.out.println();
////         
//         for(int i=0; i<solution.toArray().length; i++){
//        	 System.out.println(solution.toArray()[i]+ "  ");
//         }
	}
	
	public static void main(String[] args){
		Test attackerDefender=new Test();
		attackerDefender.generateDependentEntitiesMap();
	}
}
