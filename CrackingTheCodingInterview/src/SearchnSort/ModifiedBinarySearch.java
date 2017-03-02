package SearchnSort;

public class ModifiedBinarySearch {

	public static void main(String[] args) {
		 int[] arr = {8,7,9,2,3,4};
		 int k = 4;
		 binarySearch(arr,0,arr.length-1,k);

	}
	
	public static void  binarySearch(int[] a,int l,int u,int k){
		int m ;
		while(l<u){
			m = (l+u)/2;
			if(a[m]==k){
				System.out.println(m);
				return;
			}else if(a[l]<a[m]){
				if(k<a[m]){
					u = m-1;
				}else {
					l = m+1;
				}
			}else if(k<a[m]){
				u = m-1;
			}else if(k <a[u]){
				l= m+1;
			}else{
				
			}
		}
		System.out.println("not found");
	}

}
