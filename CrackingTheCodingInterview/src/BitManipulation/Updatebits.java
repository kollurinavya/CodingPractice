package BitManipulation;

public class Updatebits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = ~0;
		int N = 0b10000001001;
		int M = 0b10101;
		int i = 2;
		int j = 6;
		int left = max -((1<<j) -1);
		int right = (1<<i)-1;
		System.out.println(Integer.toBinaryString(left));
		System.out.println(Integer.toBinaryString(right));
		int mask = left |right;
		System.out.println(Integer.toBinaryString(mask));
		int MMod = M <<i;
		System.out.println(Integer.toBinaryString((mask&N)|MMod));
		
	}

}
