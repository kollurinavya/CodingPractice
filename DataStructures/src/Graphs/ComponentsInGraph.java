package Graphs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ComponentsInGraph {
    static HashMap<Integer,Set<Integer>> g1 = new HashMap<Integer,Set<Integer>>();
    static  HashMap<Integer,Set<Integer>> g2 = new HashMap<Integer,Set<Integer>>();
   
 public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     for(int i=0;i<n;i++){
       // System.out.print(1);
            int src = in.nextInt();
            int des = in.nextInt();
           addEdge(src,des);
     }
     int min=999;
     int max=0;
     for(Set<Integer> val:g1.values()){
         for(int i:val){
             System.out.print(i+" ");
         }
         System.out.println("");
         if(max<val.size()){
             max = val.size()+1;
         }
         if(min>val.size()){
             min = val.size()+1;
         }
     }
         System.out.println(min+" "+max);
 }
 public static void addEdge(int src,int des){
     Set<Integer> s2 = g2.get(des);
     Set<Integer> s1 = g1.get(src);
     if(s1== null){
         s1 = new LinkedHashSet<Integer>();
      }
     if(s2== null){
         s2 = new LinkedHashSet<Integer>();
         s2.add(src);
         s2.add(des);
         g2.put(des,s2);
     }else{ 
            s1.add(des);
            s1.add(src);
             s1.addAll(s2);
             g1.put(src,s1);
         s2.add(src);
         s2.add(des);
         g2.put(des,s2);
         return;
     }
     s1.add(des);
     s1.add(src);
     g1.put(src, s1);
 }

}
