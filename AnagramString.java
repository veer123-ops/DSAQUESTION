package veer.com;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="veer";
		String str2="veers";
		
		char [] x=str1.toCharArray();
		char [] y=str2.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		boolean isRuslet=Arrays.equals(x, y);
		
		if(isRuslet==true) {
			System.out.print(str1 + " anagram string");
		}else {
			System.out.print(str2 + " anagram  not string");
		}
	}

}
