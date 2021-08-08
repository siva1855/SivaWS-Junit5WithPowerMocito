package com.siva.logic;

public class Palindrome {

	public boolean isPalindrome(String str) {

		String reverse = "";

		int length = str.length();

		for (int index = length - 1; index >= 0; index--) {
			reverse = reverse + str.charAt(index);
		}
		if (str.equals(reverse)) {
			return true;
		} else {
			return false;
		}

	}

}
