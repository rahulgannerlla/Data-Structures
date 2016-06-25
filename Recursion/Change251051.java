package Recursion;

public class Change251051 {

	
	private int makeChange(int total, int denom) {
    	int nextCoin = 0;
    	switch (denom) {
    	case 25:
    		nextCoin = 10;
    		break;
    	case 10:
    		nextCoin = 5;
    		break;
    	case 5:
    		nextCoin = 1;
    		break;
    	case 1:
    		return 1; // Found a combination.Base case.
    	default:
    		return 0;
    	}
    	
    	int ways = 0;
    	for (int count = 0; count*denom <= total; ++count) {
    		ways += makeChange(total-count*denom, nextCoin);
    	}
    	return ways;
    }
    
    public int makeChange(int total) {
    	if (total < 0) return 0;
    	// Select coins with the biggest denomination first.
    	return makeChange(total, 25);
    }
    
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Change251051 c=new Change251051();
		System.out.println(c.makeChange(25));
	}

}
