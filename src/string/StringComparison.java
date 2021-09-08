/*
 * We can compare String in Java on the basis of content and reference.
 * It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator) etc.
 * There are three ways to compare String in Java:
 * 
 * By Using equals() Method
 * By Using == Operator
 * By compareTo() Method
 * 
 * The String class equals() method compares the original content of the string. It compares values of string for equality. 
 * String class provides the following two methods:
 * 
 * public boolean equals(Object another) compares this string to the specified object.
 * public boolean equalsIgnoreCase(String another) compares this string to another string, ignoring case.
 * 
 * 
 */
package string;

public class StringComparison {

	public static void main(String[] args) {
		String s = "Shivam";
		String s1 = "Shivam";
		String s2 = new String("Shivam");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		String s3 = "Gupta";
		System.out.println(s.equals(s3));
		String s4 = "shivam";
		System.out.println(s.equals(s4));// false
		System.out.println(s.equalsIgnoreCase(s4));// false

		// using == operators which check for reference not the values
		System.out.println(s == s1);// true because both refers to same instance
		System.out.println(s == s2);// false because s2 refers to instance
									// created in nonpool

		// compareTo
		// The String class compareTo() method compares values lexicographically
		// and returns an integer value that describes if first string is less
		// than, equal to or greater than second string.
		// s1 == s2 : The method returns 0.
		// s1 > s2 : The method returns a positive value.
		// s1 < s2 : The method returns a negative value.
		System.out.println(s.compareTo(s1));//0
		System.out.println(s.compareTo(s4));//-32 Shivam is less than shivam lexicographically
		System.out.println(s.compareTo(s2));//0
		System.out.println(s.compareTo(s3));//12 Shivam is greater than Gupta lexicographically
		
		System.out.println(s.compareToIgnoreCase(s4));//0 as ignorecase method is being used
	}

}
