/*
 * In Java, we can create our own exceptions that are derived classes of the Exception class. 
 * Creating our own Exception is known as custom exception or user-defined exception. 
 * Basically, Java custom exceptions are used to customize the exception according to user need.
 * 
 * Using the custom exception, we can have your own exception and message. Here, we have passed a string to the constructor of superclass 
 * i.e. Exception class that can be obtained using getMessage() method on the object we have created.
 * 
 * Note: We need to write the constructor that takes the String as the error message and it is called parent class constructor.
 *
 */

package exceptionhandling;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class CustomException {

	static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Not valid to vote");
		} else {
			System.out.println("valid to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(13);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}

	}

}
