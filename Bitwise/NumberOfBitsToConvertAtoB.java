package Bitwise;

public class NumberOfBitsToConvertAtoB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 31, b=14;
		int count =0;
		
		for(int c=a^b; c!=0; c=c>>1){
			System.out.println(c +"   "+(c&1));
			count = count + (c&1);
		}
		System.out.println(count);
	}

}
