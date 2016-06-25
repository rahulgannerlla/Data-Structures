package Matrix;

public class BooleanMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = { {1, 0, 0, 1},
		        {0, 0, 1, 0},
		        {0, 0, 0, 0},
		    };
		
		
		int row[]=new int[mat.length];
		int col[]=new int[mat[0].length];
		
		//System.out.println(mat[0].length+"   "+mat.length);
		
		for(int i=0; i<row.length; i++){
			for(int j=0; j<col.length;j++){
				if(mat[i][j]==1){
					row[i]=1; col[j]=1;
				}
			}
		}

		for(int i=0; i<row.length; i++){
			for(int j=0; j<col.length;j++){
				if(row[i]==1 || col[j]==1){
					mat[i][j]=1;
				}
			}
		}
		
		for(int i=0; i<row.length; i++){
			System.out.println("");
			for(int j=0; j<col.length;j++){
				System.out.print(mat[i][j]+" ");
			}
		}
		
	}

}
