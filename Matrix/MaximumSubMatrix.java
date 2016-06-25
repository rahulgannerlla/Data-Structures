package Matrix;

public class MaximumSubMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int M[][] =  {{0, 1, 1, 0, 1}, 
                {1, 1, 0, 1, 0}, 
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};
		
		int s[][]=new int[M.length][M[0].length];
		
		for(int i=0; i<M.length; i++)
			s[i][0]=M[i][0];
		
		for(int i=0; i<M[0].length; i++)
			s[0][i]=M[0][i];
		
		for(int i=1; i<M.length; i++){
			for(int j=1; j<M[0].length; j++){
				if(M[i][j]==1){
					s[i][j]= Math.min(Math.min(s[i-1][j], s[i][j-1]), s[i-1][j-1])+1;
				}else
					s[i][j]=0;
			}	
		}
		
		int max=s[0][0];
		int maxI=0; int maxJ=0;
		
		
		for(int i=0; i<M.length; i++){
			for(int j=0; j<M[0].length; j++){
				if(s[i][j]>max){
					max=s[i][j];
					maxI=i;
					maxJ=j;
				}
			}	
		}
		
		System.out.println(max);
		
		for(int i=maxI; i> maxI-max; i--){
			System.out.println(" ");
			for(int j=maxJ; j> maxJ-max; j--){
				System.out.print(M[i][j]+ " ");
			}
		}
		
	}
}
