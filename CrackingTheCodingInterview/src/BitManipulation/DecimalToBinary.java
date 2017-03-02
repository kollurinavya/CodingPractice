package BitManipulation;

public class DecimalToBinary {
      
      public static void main(String[] args){
    	  String s = "3.79";
          double num = Double.parseDouble(s.substring(s.indexOf("."), s.length()));
          int n1 = Integer.parseInt(s.substring(0,s.indexOf(".")));
          System.out.println(num);
          System.out.println(n1);
          String ans ="";
          while(num >0){
        	  double t = num*2;
        	  if(t>=1){
        		  ans +="1";
        		  num = t-1;
        	  }else{
        		  ans+="0";
        		  num = t;
        	  }
          }
          System.out.println(ans);
      }
}
