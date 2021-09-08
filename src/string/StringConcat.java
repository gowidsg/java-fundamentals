/*
 * 
 * In Java, String concatenation forms a new String that is the combination of multiple strings. 
 * There are two ways to concatenate strings in Java:
 * By + (String concatenation) operator
 * By concat() method
 * 
 * 
 * In Java, String concatenation is implemented through the StringBuilder (or StringBuffer) class and it's append method. 
 * String concatenation operator produces a new String by appending the second operand onto the end of the first operand. 
 * The String concatenation operator can concatenate not only String but primitive values also.
 */
package string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Shivam";
		s = s + " Gupta";
		System.out.println(s);

		// After a string literal, all the + will be treated as string
		// concatenation operator.
		String s3 = 40 + 40 + " Days of Coding " + 90 + 90;

		System.out.println(s3);

		// The String concat() method concatenates the specified string to the
		// end of current string
		String s2 = "Satyam";
		s2 = s2.concat(" Gupta");
		System.out.println(s2);

		// String.format() method allows to concatenate multiple strings using
		// format specifier like %s followed by the string values or objects.
		String s4 = String.format("%s and %s", s2, s);
		System.out.println(s4);

		// The String.join() method is available in Java version 8 and all the
		// above versions. String.join() method accepts arguments first a
		// separator and an array of String objects.
		String s5 = String.join(" ", s, s2);
		System.out.println(s5);

		// StringJoiner class has all the functionalities of String.join()
		// method. In advance its constructor can also accept optional
		// arguments, prefix and suffix.

		StringJoiner s6 = new StringJoiner(",");
		s6.add("Hi");
		s6.add("Bye");
		System.out.println(s6.toString());

		// The Collectors class in Java 8 offers joining() method that
		// concatenates the input elements in a similar order as they occur.

		List<String> liststr = Arrays.asList("HI", "I", "am", "SHivam");
		String str = liststr.stream().collect(Collectors.joining(" "));
		System.out.println(str.toString());

		// Here, a list of String array is declared. And a String object str
		// stores the result of Collectors.joining() method.

	}

}
