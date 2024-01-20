package Recursion;

public class TestRecursion {

	public static void main(String[] args) {

		int n = 5;
		int fact = 1;
		factorial(n, fact);
	}

	private static void factorial(int n, int fact) {

		if(n ==1) {
			fact = fact *n;
			System.out.println(fact);
			return;
		}
		fact = fact *n;
		factorial(n-1, fact);
	}

}
