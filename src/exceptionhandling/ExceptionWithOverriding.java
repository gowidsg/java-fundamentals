/*
 * There are many rules if we talk about method overriding with exception handling.

Some of the rules are listed below:

1)If the superclass method does not declare an exception
	a)If the superclass method does not declare an exception, 
	subclass overridden method cannot declare the checked exception but it can declare unchecked exception.

 */
package exceptionhandling;

import java.io.IOException;

class Parent {
	void msg() {
		System.out.println("parent method");
	}
}

public class ExceptionWithOverriding extends Parent {
	// it gives compile time error
	// void msg() throws IOException{
	// System.out.println("child method with checked exception");
	// }

	void msg() throws ArithmeticException {
		System.out.println("Child method with unchecked exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new ExceptionWithOverriding();
		p.msg();
	}

}
