package Recursion;
import java.io.*;
import java.util.*;
public class FibMemorization {
	static ArrayList<Integer> ans= new ArrayList<Integer>();   
	public static void main(String[] args) {
		System.out.println(fib(6));
		ans.add(1);
		for(int n:ans){
			System.out.println(n);
		}
	}
	
	public static int fib(int n){
		if(n==0){
			ans.add(0);
			return 0;
		}else if(n == 1){
			ans.add(1);
			return 1;
		}else {
			if(ans.size()== n-1){
				ans.add(ans.get(n-1)+ans.get(n-2));
				return ans.get(n-1)+ans.get(n-2);
			}else{
				return fib(n-1)+fib(n-2);
			}
			
		}

	}
}
