package exceptionhandling;

//class represents user defined exception
class UserDefinedExcetion extends Exception {
	public UserDefinedExcetion(String str) {
		super(str);// calling constructor of Exception
	}
}

// class that uses above user defined exception
public class ThrowingUserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// throw an object of user defined exception
			throw new UserDefinedExcetion("This is user defined exception");

		} catch (UserDefinedExcetion e) {
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}

	}

}
