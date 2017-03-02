package Recursion;
import java.io.*;
import java.util.*;

public class AllStringPermutations {
	static HashSet<String> ans= new HashSet<String>();
	public static void main(String[] args) {
		String s= "ABC";
		
		permutate(s,0,s.length()-1);
		for(String str:ans){
			System.out.println(str);
		}
	}
	
	public static void permutate(String s,int in,int n){
		String temp;
		if(in==n){
			ans.add(s);
			
		}else{
			for(int i=in;i<=n;i++){
				temp= swap(s,i,in);
				ans.add(temp);
				permutate(temp,in+1,n);
				temp = swap(s,i,in);
			}
		}
	}
   
	public static String swap(String s,int i,int j){
		char[] t = s.toCharArray();
		char temp = t[i];
		t[i]=t[j];
		t[j]=temp;
		String ans = String.valueOf(t);
		
		return ans;
	}
}
