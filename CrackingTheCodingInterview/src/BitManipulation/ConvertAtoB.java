package BitManipulation;
import java.io.*;
import java.util.*;
public class ConvertAtoB {
	//number of bits to be changed to make A as B
	public static void main(String[] arg){
		int a = 31;
		int b = 14;
		int c = a ^b;
		int ans =0;
		//
		while(c!=0){
			ans += c&1;
			c =c>>1;
		}
		System.out.println(ans);
	}
}
