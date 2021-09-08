/*
 * The java.util.StringTokenizer class allows you to break a String into tokens. 
 * It is simple way to break a String. It is a legacy class of Java.
 * 
 * It doesn't provide the facility to differentiate numbers, quoted strings, identifiers etc. like StreamTokenizer class.
 * We will discuss about the StreamTokenizer class in I/O chapter.
 * 
 * In the StringTokenizer class, the delimiters can be provided at the time of creation or one by one to the tokens.
 * 
 * The StringTokenizer class is deprecated now.
 * It is recommended to use the split() method of the String class or the Pattern class that belongs to the java.util.regex package.
 */

package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerIntro {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("This is string tokenizer");
		
		System.out.println("total no of tokens: "+st.countTokens());

		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}


		StringTokenizer st1 = new StringTokenizer("This.is.String.Tokenizer.with.dot", ".");
		// This method returns the same value as hasMoreTokens() method of
		// StringTokenizer class.
		// The only difference is this class can implement the Enumeration
		// interface.
		while (st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}

		// TODO Auto-generated method stub

	}

}
