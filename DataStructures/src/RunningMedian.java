
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;
public class RunningMedian {

	    static float[] ans ;
	    static PriorityQueue<Integer> minHeap ;
	    static PriorityQueue<Integer> maxHeap;
	    public RunningMedian(int n){
	        minHeap = new PriorityQueue<Integer>();
	        maxHeap = new PriorityQueue<Integer>(10,Collections.reverseOrder());
	        ans = new float[n];
	    }
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] a = new int[n];
	       // ans = new int[n];
	        RunningMedian sol = new RunningMedian(n);
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	           sol.runningMedian(a[a_i],a_i);
	        }
	        for(float i:ans){
	            System.out.println(i);
	        }
	    }
	    public void runningMedian(int n,int index){
	    	
	        if(index == 0){
	            ans[index] = n;
	            return;
	        }
	        
	            int minsize = minHeap.size();
	            int maxsize = maxHeap.size();
	            int max=0;
	            int min=9999;
	        if(index == 1){
	            if(ans[0]>n){
	                minHeap.add(n);
	                maxHeap.add((int)ans[0]);
	            }else{
	                minHeap.add((int)ans[0]);
	                maxHeap.add(n);
	            }
	        }else{
	            if(maxHeap.size()>0){
	                max = maxHeap.peek();
	            }
	            if(minHeap.size() > 0){
	                min = minHeap.peek();
	            }
	            if(minsize == maxsize){
	                if(n>max){
	                    maxHeap.add(n);
	                }else{
	                    minHeap.add(n);
	                }
	            }else{
	                if(maxsize>minsize){
	                    minHeap.add(n);
	                }else{
	                    maxHeap.add(n);
	                }
	            }
	        }
	        minsize = minHeap.size();
	        maxsize = maxHeap.size();
	        if(maxHeap.size()>0 && minHeap.size()>0 && minHeap.size() == maxHeap.size() ){
	            int x = minHeap.poll();
	            int y = maxHeap.poll();
	            System.out.println(x+" "+y);
	            ans[index]= (float)(x+y)/2;
	        }else{
	            if(maxsize>minsize){
	                ans[index]= maxHeap.poll();
	            }else{
	                ans[index]= minHeap.poll();
	            }
	        }
	        
	    }
	

}
