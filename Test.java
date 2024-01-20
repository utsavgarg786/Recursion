package Recursion;

public class Test {

	public static void main(String[] args) {

		int n = 5;
		int fact =1;
		printFact(n,fact);
	}

	private static void printFact(int n, int fact) {

		if(n == 1) {
			fact = fact * n ;
			System.out.println(fact);
			return;
		}
		fact = fact *n;
		printFact(n-1, fact);
	}
}
