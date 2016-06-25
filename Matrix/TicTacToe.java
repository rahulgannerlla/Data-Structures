package Matrix;

public class TicTacToe {
	static int win[][] = {{0, 1, 2}, // Check first row.
		{3, 4, 5}, // Check second Row
		{6, 7, 8}, // Check third Row
		{0, 3, 6}, // Check first column
		{1, 4, 7}, // Check second Column
		{2, 5, 8}, // Check third Column
		{0, 4, 8}, // Check first Diagonal
		{2, 4, 6}}; // Check second Diagonal

	public static boolean isWin(char board[], char c){

		for(int i=0; i<8; i++){
			if(board[win[i][0]]==c &&
					board[win[i][1]]==c && 
					board[win[i][2]]==c)
				return true;
		}

		return false;
	}

	public static boolean check(){
		char board[] = {'X', 'X', 'O',
						'O', 'O', 'X',
						'X', 'O', 'X'};

		int xCount=0, oCount=0;

		for(int i=0; i<board.length; i++){
			if(board[i]=='X')xCount++;
			if(board[i]=='O')oCount++;
		}

		if( xCount == oCount ||  xCount==oCount+1){
			if(isWin(board, 'O')){
				if(isWin(board, 'X'))
					return false;

				if(xCount==oCount)
					return true;
				else 
					return false;
			}

			if(isWin(board, 'X') && xCount!=oCount+1)
				return false;
		}

		return true;
	}

	public static void main(String args[]){
		System.out.println(check());	
	}
}
