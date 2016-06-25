package Recursion;

import java.util.ArrayList;
import java.util.List;

public class RobotMoves {

	public static List<String> robotPaths1(int n){
	    List<String> pathList = new ArrayList<String>();
	    getPaths(n, 1,1, "", pathList);
	    return pathList;
	}
	public static void getPaths(int n, int i, int j, String path, List<String> pathList){
	    path += String.format(" (%d,%d)", i , j);
	    if( i ==n && j == n){ //reach the (n,n) point
	    	//System.out.println(path);
	        pathList.add(path);
	    }else if( i > n || j > n){//wrong way
	        return;
	    }else {
	        getPaths(n, i +1, j , path, pathList);
	        getPaths(n, i , j +1, path, pathList);
	    }
	}
	
	// 2nd program
	public static int robotPaths(int down, int right, String path)
	{
	    path = path+ down +","+ right +"  ";
	    if(down==0 && right==0)
	    {
	        //System.out.println(path);
	        return 1;
	    }

	    int counter = 0;

	    if(down==0)
	        counter = robotPaths(down, right-1, path);
	    else if(right==0)
	        counter = robotPaths(down-1, right, path);
	    else
	        counter = robotPaths(down, right-1, path) + robotPaths(down-1, right, path);

	    return counter;
	}

	public static void main(String[] args) 
	{
	    int N = 1;
	    System.out.println("Total possible paths: "+robotPaths(4, 4, ""));

	    System.out.println(robotPaths1(5).size());
	    
	}
}
