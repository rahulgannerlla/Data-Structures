package Recursion;

public class BalanceParanthesis {

	public void recParanthesis(int size, char[] cs, int start, int end, int index){
		if(end == size){
			System.out.println();
			for(char c:cs)
				System.out.print(c);
		}else{
			if(start > end){
				cs[index]='}';
				recParanthesis(size, cs, start, end+1, index+1);
			}
			if(start < size){
				cs[index]='{';
				recParanthesis(size, cs, start+1, end, index+1);
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalanceParanthesis bp = new BalanceParanthesis();
		bp.recParanthesis(2, new char[10], 0, 0, 0);
	}

}
