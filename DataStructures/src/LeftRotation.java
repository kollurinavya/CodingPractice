import java.text.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;


public class LeftRotation {
	public static void main(String[] arg){
		int[] arr = {1,2,3,4,5};
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ans = new int[5];
			for(int i=0;i<arr.length;i++){
				int ind = i-n;
				if(ind<0){
					ind = arr.length-Math.abs(ind);			
				}
				//System.out.println(ind);
				ans[ind] = arr[i];
			}
		    n--;
			arr = ans;
		
		for(int i: ans){
			System.out.println(i);
		}
	}
}
