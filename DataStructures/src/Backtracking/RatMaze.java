package Backtracking;
import java.io.*;
import java.util.*;
public class RatMaze {
	static int[][] sol ={ {0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
	public static void main(String[] args) {
		int[][] arr ={ {1,0,0,0},{1,1,0,0},{0,1,0,0},{0,1,1,1}};
		solveMaze(arr);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(sol[i][j]);
			}
		}
	}
	
	public static void solveMaze(int[][] maze){
		mazeImp(maze,0,0);
	}
	
	public static void mazeImp(int[][] m,int i,int j){
		if(i==3 && j==3){
			return ;
		}
		
		sol[i][j]=1;
		if(i<3){
			if(m[i+1][j]==1 && sol[i+1][j]==0){
				mazeImp(m,i+1,j);
				return;
				//sol[i+1][j]=0;
			}
		}
		if(j<3){
			if(m[i][j+1]==1 && sol[i][j+1]==0){
				mazeImp(m,i,j+1);
				return;
				//sol[i][j+1]=0;
			}
		}
		
		sol[i][j]=0;
	}

}
