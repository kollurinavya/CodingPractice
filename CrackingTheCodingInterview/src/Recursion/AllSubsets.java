package Recursion;
import java.io.*;
import java.util.*;
public class AllSubsets {
     static ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int[] a = {1,2,3};
	    allsubsets.add(new ArrayList<Integer>());
	   allsubsets= createSubsets(a,a.length-1);
	   for(ArrayList<Integer> allsets:allsubsets){
		   System.out.println();
		   for(int set:allsets){
			   System.out.print(set+" ");
		   }
	   }
	}
    
	public static ArrayList<ArrayList<Integer>> createSubsets(int[] a,int in){
		if(in >= 0){
			allsubsets =createSubsets(a,in-1);
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subset:allsubsets){
				ArrayList<Integer> set = new ArrayList<Integer>();
				set.addAll(subset);
				set.add(a[in]);
				temp.add(set);
			}
		  allsubsets.addAll(temp);
		}
		return allsubsets;
	}
}
