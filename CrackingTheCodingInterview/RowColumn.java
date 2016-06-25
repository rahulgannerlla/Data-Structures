package CrackingTheCodingInterview;

public class RowColumn {
	public static void main(String args[]){
		
		int a[][]=new int[3][3];
		int row[]=new int[a.length];
		int column[]=new int[a[0].length];
		
		for(int i=0; i<row.length; i++){
			for(int j=0; j<column.length; j++){
				if(a[i][j]==0){
					row[i]=0;
					column[j]=0;
				}
			}
		}
		
		for(int i=0; i<row.length; i++){
			for(int j=0; j<column.length; j++){
				if(row[i]==0 || column[j]==0)
					a[i][j]=0;
			}
		}
		
	}
}
