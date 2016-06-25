package Matrix;

public class PrintMatrixDiagonally {
	public static void main(String[] args) {
		int originalMatrix[][] = { {1, 2, 3, 5},
		        {4, 5, 6, 10},
		        {7, 8, 9, 12},
		    };
		
		for(int i=0; i<originalMatrix.length ; i++){
			System.out.print(originalMatrix[i][0]+" ");
			
			int k=i-1;
			int j=1;
			
			while( k>=0 && k<originalMatrix.length && j<originalMatrix[0].length && j>=0 ){
				System.out.print(originalMatrix[k][j]+" ");
				k--;
				j++;
			}
			
			System.out.println(" ");
		}
		
		for(int i=1; i<originalMatrix[0].length ; i++){
			System.out.print(originalMatrix[originalMatrix.length-1][i]+" ");
			
			int k=originalMatrix.length-2;
			int j=i+1;
			
			while( k>=0 && k<originalMatrix.length && j<originalMatrix[0].length && j>=0 ){
				System.out.print(originalMatrix[k][j]+" ");
				k--;
				j++;
			}
			
			System.out.println(" ");
		}
		
	}
}
