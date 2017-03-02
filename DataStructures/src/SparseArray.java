import java.io.*;
import java.util.*;
public class SparseArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		HashMap h = new HashMap();
		for(int i=0;i<n;i++){
			String x = in.next();
			if(h.containsKey(x)){
				int t = (int) h.get(x);
				h.put(x, ++t);
			}else{
				h.put(x,1);
			}
		}
		System.out.println(h.get("abc"));
	}

}
