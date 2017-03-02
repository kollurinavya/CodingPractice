package ArraynString;

public class ReplaceString {

	public static void main(String[] args) {
		 String str = "this is the string";
		 String[] temp = str.split(" ");
		 String ans ="";
		 for(int i =0;i<temp.length;i++){
			 if(temp.length-1 == i){
				 ans += temp[i];
				 break;
			 }
			 ans += temp[i];
			 ans += "%20";
			 
		 }
		 System.out.println(ans);

	}

}
