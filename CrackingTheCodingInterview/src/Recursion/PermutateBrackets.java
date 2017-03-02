package Recursion;
import java.io.*;
import java.util.*;
public class PermutateBrackets {

	public static void main(String[] args) {
		int n = 3;
		char[] s = new char[6];
		permutate(3,3,s,0);

	}
	public static void permutate(int l,int r,char[] str,int count){
		if(l<0&&r<0){ return;}
		if(l== 0 && r==0){
			System.out.println(str);
			
		}
		if(l>0) {
			str[count]= '(';
			permutate(l-1,r,str,count+1);
		}
		if(r>l ){
			str[count]=')';
			permutate(l,r-1,str,count+1);
		}
	}
}
