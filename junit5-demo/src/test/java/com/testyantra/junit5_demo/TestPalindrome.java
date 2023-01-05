package com.testyantra.junit5_demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Palindrom Class")
public class TestPalindrome {
	
	private Palindrome palindrome;
	private String str;
	
	@BeforeEach
	public void setUpBeforeEachTestMethod() {
		str="abba";
		palindrome=new Palindrome();
				
	}
	
	@Test
	public void testIsPalindrome() {
		System.out.println(palindrome.isPalindrome(str));
		Assertions.assertTrue(palindrome.isPalindrome(str));
		
	}
	
	@AfterEach
	public void clearUpAfterEachTestMethod() {
		palindrome=null;
	}
}
