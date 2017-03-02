package SearchnSort;

public class ModifiedMerge {

	public static void main(String[] args) {
		int[] a = new int[10];
		int[] b = {2,4,8,9};
		a[0]=1;
		a[1]=5;a[2]=6;a[3]=7;
		int aLength = 0;
		for(int i =0;i<a.length;i++){
			if(i>0 && a[i]==0){
				aLength =i;
				break;
			}
		}
		int k = aLength +b.length-1;
		int ap = aLength-1;
		int bp = b.length-1;
		while(k!=0){
			if(ap<0){
				a[k]= b[bp];
				bp--;
				k--;
				continue;
			}
			if(bp<0){
				a[k] = a[ap];
				ap--;
				k--;
				continue;
			}
			if(a[ap]>b[bp]){
				a[k] = a[ap];
				ap--;
			}else{
				a[k]=b[bp];
				bp--;
			}
			k--;
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
				

	}

}
