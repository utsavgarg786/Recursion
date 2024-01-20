package Recursion;

public class Fibonaci {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);
		int n = 10;
		int ans = fib(n); 
		System.out.println(ans);
	}

	private static int fib(int n) {

		if(n<2) {
			return n;
		}
		else {
			return fib(n-2)+ fib(n-1);
		}
		
	}
}
