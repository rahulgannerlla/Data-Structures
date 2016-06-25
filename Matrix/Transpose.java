package Matrix;

public class Transpose {
	public static void main(String[] args) {
		int originalMatrix[][] = { {1, 2, 3, 5},
		        {4, 5, 6, 10},
		        {7, 8, 9, 12},
		    };
		
		for(int i=0; i<originalMatrix.length; i++){
			for(int j=0; j<originalMatrix[0].length; j++){
				if(i==j)
					break;
				else{
					int temp=originalMatrix[i][j];
					originalMatrix[i][j]=originalMatrix[j][i];
					originalMatrix[j][i]=temp;
				}
			}
		}
		
		for(int i=0; i<originalMatrix.length; i++){
			System.out.println("");
			for(int j=0; j<originalMatrix[0].length; j++){
				System.out.print(originalMatrix[i][j]+" ");
			}
		}
	}
}
