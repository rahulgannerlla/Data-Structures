package arrays;

public class FibonacciLogn {
	
	
	public int fib(int n){
		int F[][] = new int[][]{{1,1},{1,0}};
		recFib(F, n-1);
		return F[0][0];
	}
	
	public void recFib(int F[][], int n){
		//bigin
		
		//System.out.println("n"+n);
		if(n==0 || n==1)
			return;
		int M[][]=new int[][]{{1,1},{1,0}};
		
		recFib(F, n/2);
		multiply(F, F);
		
		if(n%2!=0){
			multiply(F, M);
			System.out.println("at m"+ n);
		}
	}
	
	public void multiply(int[][] F, int[][] P){
		int x = F[0][0]*P[0][0] + F[0][1]*P[1][0] ;
		int y = F[0][0]*P[0][1] + F[0][1]*P[1][1] ;
		int z = F[1][0]*P[0][0] + F[1][1]*P[1][0] ;
		int w = F[1][0]*P[0][1] + F[1][1]*P[1][1] ;
		
		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
				
		//System.out.println(F[0][0]);
	}
	
	private static void main(String[] args) {
		// TODO Auto-generated method stub
//		FibonacciLogn f=new FibonacciLogn();
//		System.out.println(f.fib(9));
	}

}
