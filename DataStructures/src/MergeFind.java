import java.io.*;
import java.util.*;
public class MergeFind {

	  static int[] id;
	    static int[] size;
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        id = new int[n*2];
	        size  = new int[n*2];
	      //  id[0]=-1;
	        //size[0]=-1;
	        for(int i=1;i<n*2;i++){
	            id[i] = i;
	            size[i] =1;
	        }
	        for(int i=0;i<n;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            merge(a,b);
	        }
	        Arrays.sort(size);
	        
	        int min = 999;
	        int max =0;
	        for(int i:size){
	        	System.out.println(i);
	            if(i<min && i>=2){
	            	min = i;
	            }
	            if(i>max){
	            	max = i;
	            }
	        }
	        System.out.println(min+" "+max);
	    }
	    
	    public static void merge(int a,int b){
	        int i = find(a);
	        int j = find(b);
	        if(i==j) return;
	        if(size[i]>size[j]) {
	            id[j] = i;
	            size[i] +=size[j];
	        }else{
	            id[i] =j;
	            size[j]+=size[i];            
	        }
	    }
	    
	    public static int find(int i){
	        while(id[i]!=i){
	            int temp = id[i];
	            i = id[temp];
	        }
	        return i;
	    }

}
