package Recursion;

public class PrintNum {

	public static void main(String[] args) {

		int i = 1;
		printNo(i);
	}

	private static void printNo(int i) {

		if(i == 6) {
			return;
		}
		System.out.println(i);
		printNo(i+1);
	}

}
