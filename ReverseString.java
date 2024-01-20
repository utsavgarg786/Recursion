package Recursion;

public class ReverseString {

	public static void main(String[] args) {

		String s = "utsav";
		int i = s.length()-1;
		reverse(s, i);
	}

	private static void reverse(String s, int i) {

		if(i == 0) {
			Character ans= s.charAt(i);
			System.out.println(ans);
			return;
		}
		Character ans = s.charAt(i);
		System.out.print(ans);
		reverse(s, i-1);
		
	}

}
