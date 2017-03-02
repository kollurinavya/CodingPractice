package ArraynString;

public class RotateMatrix {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		 int n = a.length;
		for(int i=0;i<n/2;i++){
			int first = i;
			int last = n-i-1;
			for(int j=first;j<last;j++){
				int offset = j-first;
				int temp = a[first][j];
				a[first][j]=a[last-offset][first];
				a[last-offset][first]=a[last][last-offset];
				a[last][last-offset] = a[j][last];
				a[j][last]= temp;
			}
		}
		//System.out.println(a[2][0]);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
}
