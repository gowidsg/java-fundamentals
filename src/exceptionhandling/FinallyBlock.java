/*Java finally block is a block used to execute important code such as closing the connection, etc.

Java finally block is always executed whether an exception is handled or not. 
Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.

The finally block follows the try-catch block.

Rule: For each try block there can be zero or more catch blocks, but only one finally block.

Note: The finally block will not be executed if the program exits (either by calling System.exit() or by causing a fatal error 
that causes the process to abort).
*/
package exceptionhandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String conn = null;
			conn.charAt(0);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("connection close");
		}

	}

}
