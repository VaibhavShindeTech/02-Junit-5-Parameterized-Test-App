package com.vaibhavtech;

public class Palindrome {
	public Boolean isPalindrome(String str) {
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		if (str.equals(reverse.toString()))
			return true;
		else
			return false;
	}
}
