package SearchnSort;
import java.io.*;
import java.util.*;
public class StringBInarySearch {
	
      public static void main(String[] arg){
    	  String[] arr = {"at","","","","ball","","","car","","","dad","",""};
    	  String s = "ball";
    	  System.out.println(binarySearch(arr,0,arr.length-1,s));
      }
      
      public static int binarySearch(String[] a,int l,int u,String s){
    	  int m;
    	  while(l<=u){
    		  m = (l+u)/2;
    		  if(s.compareTo(a[m])==0){
    			  return m;
    		  }
    		  while(a[m].compareTo("")==0 && m<=u){
    			  m = m+1;
    		  }
    		  if(m>u){
    			   u=((l+u)/2)-1; 
    			   continue;
    		  }
    		  if(s.compareTo(a[m]) ==0){
    			  return m;
    		  }else if(s.compareTo(a[m]) >0){
    			  l = m+1;
    		  }else{
    			  u = m-1;
    		  }
    		  
    		}
    	  return -1;
      }
}
