package Matrix;

public class SpiralForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] =new int[][] {{1,  2,  3,  4,  5,  6},{7,  8,  9,  10, 11, 12},{13, 14, 15, 16, 17, 18}};
		
		int k=0, l=0, m=a.length, n=a[0].length, i;
		
		while(k<m && l<n){
			for(i=l; i<n; i++){
				System.out.println(a[k][i]);
			}
			k++;
			
			for(i=k; i<m; i++){
				System.out.println(a[i][n-1]);
			}
			n--;
			
			if(k<m){
				for(i=n-1; i>=l; i--){
					System.out.println(a[m-1][i]);
				}
				m--;
			}
			
			if(l<n){
				for(i=m-1; i>=k; i--){
					System.out.println(a[i][l]);
				}
				l++;
			}
		}
	}

}
