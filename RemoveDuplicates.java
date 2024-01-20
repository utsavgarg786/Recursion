package Recursion;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String s = "abcabcabcde";
		int i =0;
		Set<Character> set = new HashSet<>();
		removeDuplicates(s,i,set);
	}

	private static void removeDuplicates(String s, int i, Set<Character> set) {

		if(i == s.length()) {
			for(char c : set) {
				System.out.print(c);
			}
			return;
		}
		set.add(s.charAt(i));
		removeDuplicates(s, i+1, set);
	}

}
