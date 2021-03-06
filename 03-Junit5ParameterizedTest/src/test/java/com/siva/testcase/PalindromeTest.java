package com.siva.testcase;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.siva.logic.Palindrome;

public class PalindromeTest {
	
	@ParameterizedTest
	@ValueSource(strings = { "radar", "liril", "racecar"})
	public void testIsPalindrome(String input) {

		Palindrome palindrome = new Palindrome();
		boolean actualResult = palindrome.isPalindrome(input);
		assertTrue(actualResult);
	}
}
