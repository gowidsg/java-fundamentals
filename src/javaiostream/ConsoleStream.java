//The Java Console class is be used to get input from console. It provides methods to read texts and passwords.
//
//If you read password using Console class, it will not be displayed to the user.
//
//The java.io.Console class is attached with system console internally. The Console class is introduced since 1.5.
package javaiostream;

import java.io.Console;

//will not work on IDE

class ConsoleStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c = System.console();
		System.out.println("Enter your pass: ");  
		char []text = c.readPassword();
		System.out.println("Text: " + text);
	}

}
