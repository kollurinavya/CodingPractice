import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Abbrevation {

    static int charChange = 0;
    static int hasupper = 0;
public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
    int n = in.nextInt();
        String[] ans  = new String[n];
    
    for(int i=0;i<n;i++){
    String a = in.next();
   String b = in.next();
   
      ans[i]=checkHelper(a,b);    
    }
//    boolean upper= true;
    
    for(String x:ans){
        System.out.println(x);
    }
   
}
public static String checkHelper(String a,String b){
	charChange =0;
	hasupper =0;
	return check(a,b);
}
public static String check(String a,String b){
        
    if(a.equals(b)){
    	if(hasupper ==1){
    		if(charChange ==1){
    			return "YES";
    		}else{
    			return "NO";
    		}
    	}else{
    		return "YES";
    	}
    }
    if(b.length() ==0 ){
    	if(hasupper ==1){
    		if(charChange ==1){
    			return "YES";
    		}else{
    			return "NO";
    		}
    	}else{
    		return "YES";
    	}
        
    }
    int alen = a.length();
    int blen = b.length();

    if(alen >0 && blen>0 ){
    
        char temp1 = Character.toUpperCase(a.charAt(alen-1));
        if( temp1 == b.charAt(blen-1)){
            charChange = 1;
             return  check(a.substring(0,alen-1),b.substring(0,blen-1));   
        }else
         if(a.charAt(alen-1)==b.charAt(blen-1)){
          return  check(a.substring(0,alen-1),b.substring(0,blen-1));
       }else{
 
              if(Character.isUpperCase(a.charAt(a.length()-1))){hasupper = 1;}
               return check(a.substring(0,a.length()-1),b); 
            
    }     
    
}
    return "NO";
}   
}

