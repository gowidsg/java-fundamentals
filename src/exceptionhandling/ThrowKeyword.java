/*The Java throw keyword is used to throw an exception explicitly.

We specify the exception object which is to be thrown. The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.

We can throw either checked or unchecked exceptions in Java by throw keyword. 
It is mainly used to throw a custom exception.	

Note: If we throw unchecked exception from a method, it is must to handle the exception or declare in throws clause.

If we throw a checked exception using throw keyword, 
it is must to handle the exception using catch block or the method must declare it using throws declaration.
*/

package exceptionhandling;

public class ThrowKeyword {
	public void validateAge(int age) {
		// The above code throw an unchecked exception. Similarly, we can also
		// throw unchecked and user defined exceptions.
		if (age < 18) {
			throw new ArithmeticException("Person is not eligible to vote");
		} else {
			System.out.println("Person is eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowKeyword tk = new ThrowKeyword();
		tk.validateAge(16);
		System.out.println("rest of code");
	}

}
