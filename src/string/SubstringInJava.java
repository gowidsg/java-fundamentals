/*
 * A part of String is called substring. 
 * In other words, substring is a subset of another String. 
 * Java String class provides the built-in substring() method that extract a substring from the given string 
 * by using the index values passed as an argument. 
 * In case of substring() method startIndex is inclusive and endIndex is exclusive.
 * 
 * 
 */

package string;

import java.util.Arrays;

public class SubstringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Shivam";
		System.out.println(s.substring(1));
		System.out.println(s.substring(0, 4));
		
		String line = new String("My name is Shivam Gupta");
		String []words = line.split(" ");
		System.out.println(Arrays.toString(words));
	}

}
