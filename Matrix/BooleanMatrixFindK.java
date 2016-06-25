package Matrix;

public class BooleanMatrixFindK {
	public static void main(String args[]){
		int matrix[][] = {  {1, 0, 0, 0, 0},
                			{0, 0, 0, 0, 0},
                			{1, 1, 1, 1, 0},
                			{1, 1, 0, 0, 0},
                			{0, 1, 1, 1, 1}};
	
		int i=0, j=matrix.length-1;
		int res=-1;
		
		while(i<matrix.length && j>=0){
			if(matrix[i][j]==0){
				while(j>=0 && (matrix[i][j]==0 || i==j))
					j--;
				
				if(j==-1){
					res=i; break;
				}
				else i++;
			}else{
				while(i<matrix.length && (matrix[i][j]==1 || i==j))
					i++;
				
				if(i==matrix.length){
					res=j;
					break;
				}else 
					j--;
			}
		}
		
		 for (int k=0; k<matrix.length; k++)
		       if (res != k && matrix[k][res] != 1)
		          System.out.println("false");
		 
		    for (int k=0; k<matrix.length; k++)
		       if (res != k && matrix[res][k] != 0)
		    	   System.out.println("false");
		
		System.out.println(res);
	}
}	
