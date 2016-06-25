package arrays;

public class RotateArrayBy90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]=new int[][]{{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};
		
		System.out.println(a.length);
		
		for(int i=0; i<a.length/2; i++){
			int first=i;
			int last=a.length-1-i;
			
			for(int j=first; j<last; j++){
				int oSet = j - first;
				int temp = a[first][j];
				a[first][j] = a[last - oSet][first];
				a[last - oSet][first] = a[last][last - oSet];
				a[last][last-oSet] = a[j][last];
				a[j][last]=temp;
			}
		}
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
