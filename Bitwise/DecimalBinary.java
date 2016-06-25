package Bitwise;

public class DecimalBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "8.625";
		
		int intPart = Integer.parseInt(x.substring(0, x.indexOf('.')));
		double decPart = Double.parseDouble(x.substring(x.indexOf('.'), x.length()));
		
		String intString="";
		String decString="";
		
		while(intPart>0){
			int r = intPart%2;
			intPart >>=1;
			intString= r + intString;
		}
		
		//System.out.println(decPart);
		
		while(decPart > 0){
			if(decString.length() > 32)
				break;
			
//			if(decPart == 1.0)
//				break;
//			
			double r = 2 * decPart;
			System.out.println(r+"  "+decString);
			
			if(r>=1){
				decString = "1"+decString;
				decPart = r-1;
			}else{
				decString = "0"+decString;
				decPart=r;
			}
			
		}
		
		System.out.println(intString+  "  "+ decString);
	}

}
