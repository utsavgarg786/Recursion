package Recursion;

public class MoveAllX {

	public static void main(String[] args) {

		String s = "abxcdxxe";
		int i = 0;
		int count = 0;
		String newString = "";
		moveAllX(s,i,count,newString);
	}

	private static void moveAllX(String s, int i, int count, String newString) {

		if(i == s.length()) {
			for(int j = 0 ; j< count ; j++) {
				newString = newString + 'x';
			}
			System.out.println(newString);
			return;
		}
		if(s.charAt(i) == 'x') {
			count++;
			moveAllX(s, i+1, count, newString);
		}
		else {
			newString = newString + s.charAt(i);
			moveAllX(s, i+1, count, newString);
		}
	}

}
