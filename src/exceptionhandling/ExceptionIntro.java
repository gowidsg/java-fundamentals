/*
 * The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
 *
 * What is Exception in Java?
 * Dictionary Meaning: Exception is an abnormal condition.
 * In Java, an exception is an event that disrupts the normal flow of the program. It is an object which is thrown at runtime.
 * 
 * 
 * The java.lang.Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error. 
 * 
 * There are mainly two types of exceptions: checked and unchecked. An error is considered as the unchecked exception. 
 * 
 * However, according to Oracle, there are three types of exceptions namely
 * 
 * Checked Exception
 * Unchecked Exception
 * Error
 * 
 * 
 * 1) Checked Exception
 * The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
 * For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
 * 
 * 2) Unchecked Exception
 * The classes that inherit the RuntimeException are known as unchecked exceptions. 
 * For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
 * Unchecked exceptions are not checked at compile-time, but they are checked at runtime.
 * 
 * 3) Error
 * Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.
 */

package exceptionhandling;

public class ExceptionIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java try block is used to enclose the code that might throw an
		// exception. It must be used within the method.
		//
		// If an exception occurs at the particular statement in the try block,
		// the rest of the block code will not execute. So, it is recommended
		// not to keep the code in try block that will not throw an exception.
		//
		// Java try block must be followed by either catch or finally block.
		try {
			System.out.println(100 / 0);

		}

		// Java catch block is used to handle the Exception by declaring the
		// type of exception within the parameter. The declared exception must
		// be the parent class exception ( i.e., Exception) or the generated
		// exception type. However, the good approach is to declare the
		// generated type of exception.
		//
		// The catch block must be used after the try block only. You can use
		// multiple catch block with a single try block.
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of code");

	}

}
