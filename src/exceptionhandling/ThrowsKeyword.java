/*
 * The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception. 
 * So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.

Exception Handling is mainly used to handle the checked exceptions. 
If there occurs any unchecked exception such as NullPointerException, 
it is programmers' fault that he is not checking the code before it being used.
 */

package exceptionhandling;

import java.io.IOException;

public class ThrowsKeyword {
	void m() throws IOException { // Rule: If we are calling a method that
									// declares an exception, we must either
									// caught or declare the exception.
		throw new IOException("device error");
	}

	void n() throws IOException {
		m();
	}

	void p() {// Rule: If we are calling a method that declares an exception, we
				// must either caught or declare the exception.
		try {
			n();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception handled");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsKeyword tk = new ThrowsKeyword();
		tk.p();

	}

}
