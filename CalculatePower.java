package Recursion;

public class CalculatePower {

	public static void main(String[] args) {

		int x = 2;
		int n =5;
		int ans = calPow(x,n);
		System.out.println(ans);
	}

	private static int calPow(int x, int n) {

		if(x == 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		int num = calPow(x, n-1);
		int ans  = x * num;
		return ans;
	}

}
