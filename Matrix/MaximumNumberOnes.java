package Matrix;

public class MaximumNumberOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[][] = { {0, 0, 0, 1},
		        {0, 1, 1, 1},
		        {1, 1, 1, 1},
		        {0, 0, 0, 0}
		    };
		
		int j=-1, index=-1;
		
		for(int i=0; i< num[0].length; i++){
			if(num[0][i]==1){
				j=i;
				break;
			}
		}
		
		if(j==-1)
			j=num[0].length;
		
		
		for(int i=1; i<num.length; i++){
			while(j>=0 && num[i][j]==1){
				j=j-1;
				index=i;
			}
		}
		
		System.out.println(index);
	}

}
