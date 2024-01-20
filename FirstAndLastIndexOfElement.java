package Recursion;

public class FirstAndLastIndexOfElement {
	public static int first = -1;
	public static int last = -1;
	
	
	public static void main(String[] args) {
	
		String s = "abaacdfsfsfsahc";
		findOccurences(s,0,'c');
	}


	private static void findOccurences(String s, int index, Character element) {

		if (index == s.length()) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char currentElement = s.charAt(index);
		if(currentElement == element) {
			if (first == -1) {
				first = index;
			}
			else {
				last = index;
			}
		}
		findOccurences(s, index+1, element);
	}

}
