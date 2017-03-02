package Recursion;

public class CoinChange {

	public static void main(String[] args) {
		int[] coins = {25,10,5,1};
		System.out.println(countWays(coins,27,0));

	}
	
	public static int countWays(int[] a,int n , int i){
		if(n<0){
			return 0;
		}
			if(n==0){
				return 1;
			}
		if(i>a.length-1){
			return 0;
		}
		
		if(n>a[i]){
			return countWays(a,n-a[i],i)+countWays(a,n,i+1);
		}else{
			return countWays(a,n,i+1);
		}
	}

}
