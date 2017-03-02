package Recursion;
import java.io.*;
import java.util.*;
public class Robo {
	public static void main(String[] arg){
		int[][] a = {{1,0,0},{0,0,0},{0,0,1}};
	      System.out.println(findPaths(a,0,0));

	}
	
	public static int findPaths(int[][] a,int i,int j){
		if(i==2 && j==2){
			return 1;
		}
		if(i>=2){
			return findPaths(a,i,j+1);
		}
		if(j>=2){
			return findPaths(a,i+1,j);
		}
		if(i<3){
			return findPaths(a,i+1,j)+findPaths(a,i,j+1);
		}
		return 0;
	}
}
