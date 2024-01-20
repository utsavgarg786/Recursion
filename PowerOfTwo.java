package Recursion;

public class PowerOfTwo {

	public static void main(String[] args) {

		int n =24;
		boolean ans = isPowerOfTwo(n);
		System.out.println(ans);
	}

	private static boolean isPowerOfTwo(int n) {

		if(n==1) {
			return true;
		}
		if((n&1) == 1) {
			return false;
		}
		return isPowerOfTwo(n>>1);
	}

}
