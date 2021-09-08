/*
 * In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string.
 * Java String class provides a lot of methods to perform operations on strings such as 
 * compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.
 *
 *	The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
 *
 * The CharSequence interface is used to represent the sequence of characters. String, StringBuffer and StringBuilder classes implement it. 
 * It means, we can create strings in Java by using these three classes.
 * 
 * The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. 
 * For mutable strings, you can use StringBuffer and StringBuilder classes.
 */

package string;

public class StringIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []ch = {'s','h','i','v'};
		String s = new String(ch);
		// Sting s = "shiv"
		System.out.println("using string object: "+s);
		System.out.println("Using valueOf method: "+String.valueOf(ch));
		
	}

}
