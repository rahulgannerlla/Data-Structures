package arrays;

public class MedianOfTwoSortedArrays {

	public static float median(int arr1[], int l1, int h1, int arr2[], int l2, int h2){
		
		int mid1 = (l1+h1)/2;
		int mid2 = (l2+h2)/2;
		
		if(h1-l1 == 1)
			return (Math.max(arr1[l1],arr1[l2]) + Math.min(arr2[h1],arr2[h2]))/2;
		else if (arr1[mid1]>arr2[mid2])
			return median(arr1, l1, mid1, arr2, mid2, h2);
		else
			return median(arr1, mid1, h1, arr2, l2, mid2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[]{2,4,6,8,10};
		int arr2[]=new int[]{1,3,5,7,9};
//		
//		int arr1[]=new int[]{1,12,15,26,38};
//		int arr2[]=new int[]{2,13,17,30,45};
		
		
		System.out.println(median(arr1, 0, arr1.length-1, arr2, 0, arr2.length-1));
	}

}
