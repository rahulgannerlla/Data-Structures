package Matrix;

public class SearchSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = new int[][]{ {10, 20, 30, 40},{15, 25, 35, 45},{27, 29, 37, 48},{32, 33, 39, 50}};
		int n=mat[0].length;

		int i=0, j=n-1;
		
		while(i<n && j>=0){
			if(mat[i][j]==27){
				System.out.println("Element found");
				break;
			}
			
			if(mat[i][j]<27)
				i++;
			else
				j--;
		}
	}
}
