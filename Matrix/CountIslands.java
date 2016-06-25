package Matrix;

public class CountIslands {
	
	
	public static void main(String args[]){
		int mat[][] =  {{'O', 'O', 'O'},
                {'X', 'X', 'O'},
                {'X', 'X', 'O'},
                {'O', 'O', 'X'},
                {'O', 'O', 'X'},
                {'X', 'X', 'O'}
              };
		
		int count=0;
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				if(mat[i][j]=='X'){
					if((i==0 || mat[i-1][j]=='O')&&(j==0 || mat[i][j-1]=='O')){
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
