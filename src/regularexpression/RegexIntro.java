/*
 * The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.

It is widely used to define the constraint on strings such as password and email validation. After learning Java regex tutorial, you will be able to test your regular expressions by the Java Regex Tester Tool.

Java Regex API provides 1 interface and 3 classes in java.util.regex package.
 *
 *
 *Matcher class
It implements the MatchResult interface. It is a regex engine which is used to perform match operations on a character sequence.
*
*Pattern class
It is the compiled version of a regular expression. It is used to define a pattern for the regex engine.
*/
package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIntro {

	public static void main(String[] args) {
		// 1st way
		Pattern p = Pattern.compile(".s");//represents single character before s
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		System.out.println(b);
		// 2nd way
		System.out.println(Pattern.compile(".s").matcher("as").matches());
		// 3rd way
		System.out.println(Pattern.matches(".s", "as"));
		
		System.out.println(Pattern.matches(".s", "shi"));
	
		System.out.println(Pattern.matches("..p", "map"));
	
	}

}
