package exceptionhandling;

class MyException extends Exception {

}

public class CustomeException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new MyException();
		} catch (MyException e) {
			System.out.println("Exception handled as: " + e.getMessage());
			// System.out.println(e.getMessage());
		} finally {
			System.out.println("Free up the resources");
		}
	}

}
