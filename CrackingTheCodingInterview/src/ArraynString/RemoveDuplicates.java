package ArraynString;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s= "abcda";
		
		int cur = 0;
		
		for(int i =1;i<s.length();i++){
			int j=0;
			while(j < cur){
				if(s.charAt(i)==s.charAt(j))
					break;
			}
			if(j==cur){
				
			}
			
		}

	}

}
