package stringproblems;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder revstr = new StringBuilder(str);
		if (str.equalsIgnoreCase(revstr.reverse().toString())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
