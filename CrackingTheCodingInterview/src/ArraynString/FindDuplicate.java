package ArraynString;
import java.io.*;
import java.util.*;
public class FindDuplicate {
	public static void main(String[] arg){
		String s ="string";
		char[] temp = s.toCharArray();
		int[] arr = new int[256];
		for(int i=0;i<256;i++){
			arr[i]=0;
		}
		for(char c:temp){
			if(arr[c]==1){
				System.out.println("contains duplicate");
				break;
			}
			arr[c]= 1;
		}
	}
}
