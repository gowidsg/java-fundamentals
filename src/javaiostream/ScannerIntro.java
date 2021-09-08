/*
 * Scanner class in Java is found in the java.util package. Java provides various ways to read input from the keyboard, 
 * the java.util.Scanner class is one of them.

The Java Scanner class breaks the input into tokens using a delimiter which is whitespace by default. 
It provides many methods to read and parse various primitive values.

The Java Scanner class is widely used to parse text for strings and primitive types using a regular expression. 
It is the simplest way to get input in Java. 
By the help of Scanner in Java, we can get input from the user in primitive types such as int, long, double, byte, float, short, etc.

The Java Scanner class extends Object class and implements Iterator and Closeable interfaces.

The Java Scanner class provides nextXXX() methods to return the type of value such as nextInt(), nextByte(), nextShort(), next(), nextLine(), nextDouble(), nextFloat(), nextBoolean(), etc. To get a single character from the scanner, you can call next().charAt(0) method which returns a single character.
 */

package javaiostream;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My/I/The";
		Scanner sc = new Scanner(s);
		sc.useDelimiter("/");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
		
		Scanner sp = new Scanner(System.in);
		System.out.println(sp.nextLine());
		System.err.println(sp.nextInt());
		System.out.println(sp.nextDouble());

	}

}
