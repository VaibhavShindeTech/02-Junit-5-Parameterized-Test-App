package com.vaibhavtech.test;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.vaibhavtech.Palindrome;

public class PalindromeTest {
	@ParameterizedTest
	@ValueSource(strings = {"ram","shyam","bike","vaibhav"})
	public void isPalindromeTest(String str) {
		Palindrome palindrome = new Palindrome();
		boolean actual = palindrome.isPalindrome(str);
		assertFalse(actual);
	}

}
