package Matrix;

import java.util.Arrays;

public class LongestPath {
	
	public static int recursiveCall(int m, int n, int [][] matrix, int [][]newM){
		
		
		
		return 1;
	}
	
	public static void main(String args[]){
		 int  matrix[][] = {{1, 2, 9},
                 {5, 3, 8},
                 {4, 6, 7}};
		 
		 int newM[][]=new int[3][3];
		 Arrays.fill(newM, -1);
		 int result=1;
		 
		 for(int i=0; i<matrix.length; i++){
			 for(int j=0; j<matrix.length; j++){
				 if(newM[i][j]==-1)
					 recursiveCall(3,3,matrix,newM);
				 
				 result=Integer.max(result, newM[i][j]);
			 }
		 }
		 System.out.println(result);
	}
}
