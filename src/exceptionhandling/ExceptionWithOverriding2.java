/*
 * 	
2)If the superclass method declares an exception
	a)If the superclass method declares an exception, 
	subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
 */
package exceptionhandling;

import java.io.IOException;

class Greet {
	void msg() throws IOException {
		System.out.println("parent method with checked exception");
	}
}

public class ExceptionWithOverriding2 extends Greet {
	// void msg() throws Exception{
	// System.out.println("child class method can't call superclass exception of
	// the parent class");
	// }
	
	// If the superclass method declares an exception,
	// subclass overridden method can declare same, subclass exception or no
	// exception but cannot declare parent exception.

	void msg() throws IOException {
		System.out.println("child class with checked exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greet g = new ExceptionWithOverriding2();
		try {
			g.msg();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
