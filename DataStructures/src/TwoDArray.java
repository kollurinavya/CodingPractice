import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArray {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int x=0;
        int max=0;
        boolean isNeg = false;
        while(x<4){
        	int y=0;
        	
        	while(y<4){
        		int sum = arr[x][y]+arr[x][y+1]+arr[x][y+2]+arr[x+1][y+1]+arr[x+2][y]+arr[x+2][y+1]+arr[x+2][y+2];
        		
        		if(Math.abs(sum)>max){
        			if(sum<0){
        				isNeg = true;
        			}
        			max = Math.abs(sum);
        		}
        		y++;
        	}
        	x++;
        }
        if(isNeg){
        	System.out.println(max*(-1));
        }else{
        	System.out.println(max);
        }
        
	}
	
}
