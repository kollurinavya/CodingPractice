package ArraynString;

public class Anagrams {
	public static void main(String[] args){
		String s1= "cat";
		String s2 = "acts";
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int[] temp = new int[256];
		for(int i=0;i<256;i++){
			
			temp[i]= 0;
		}
		
		for(int i=0;i<arr1.length;i++){
			if(temp[arr1[i]]==0){
				temp[arr1[i]]= 1;
			}else{
				temp[arr1[i]] += 1;
			}
			
		}
		for(int i=0;i<arr2.length;i++){
			if(temp[arr2[i]] >= 1){
				temp[arr2[i]]--;
			}else{
				System.out.println("not anagram");
				break;
			}
		}
		
	}
}
