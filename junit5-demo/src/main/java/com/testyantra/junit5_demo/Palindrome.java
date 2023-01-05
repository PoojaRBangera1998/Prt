package com.testyantra.junit5_demo;

public class Palindrome {
	public boolean isPalindrome(String str) {
		//Logic
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			result+=c;
		}
		if(result.equals(str)) 
			return true;
		return false;
		}
		
		public static void main(String[] args) {
			String str="abba";
			Palindrome palindrome=new Palindrome();
			System.out.println("The Result is: "+palindrome.isPalindrome(str));
		}
	
}
