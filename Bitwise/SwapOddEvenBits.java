package Bitwise;

public class SwapOddEvenBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		
		int x = 23;
		System.out.println(  (x & 0xaaaaaaaa) >>1 );
		System.out.println(  (x & 0x55555555) <<1 );
		System.out.println(  ((x & 0xaaaaaaaa) >>1) | ((x & 0x55555555) <<1));
	}

}
