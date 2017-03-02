package LinkedList;

import java.util.Stack;

public class InterpolationSearch {

	public static void main(String[] args) {
		int[] arr = {2,5,8,12,16,23,38,56,72,91};
		int x = 56;
		System.out.println(interpol(arr,x,0,arr.length-1));
		Stack<String> s = new Stack<String>();
		String[] values = {"{","}"};
	    for(int i=0;i<values.length;i++){
	    	String ch = values[i];
	    	if(ch == "{" || ch=="[" || ch== ")" ){
	    		s.push(ch);
	    	}
	    	if(ch == "}" || ch=="]" || ch==")"){
	    		if(!s.isEmpty()){
	    			String t = s.pop();
	    			if(ch == "}" && t == "{"){
	    				s.removeAll(s);
	    				//return true;
	    			}else if()
	    		}else{
	    			//return no
	    		}
	    		
	    	}
	    }
	}
	
	public static int interpol(int[] arr,int x,int low,int high){
		int pos=arr.length;
		if(low<arr.length-1){
			pos = low + ((x-arr[low])*(high-low)/(arr[high]-arr[low]));
			
		}
		
		if(pos <= arr.length-1){
			if(arr[pos]== x){
				return pos;
			}
			if(arr[pos]<x){
				return interpol(arr,x,pos+1,arr.length-1);
						
			}else{
				return interpol(arr,x,low,pos-1);
			}
		}
		return -1;
	}

}
