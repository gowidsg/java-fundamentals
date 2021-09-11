package javaeightfeatures;

import java.util.GregorianCalendar;

interface MathOperations {
	int operation(int a, int b);
}

interface GreetingService {
	void sayMessage(String msg);
}

public class LambdaExpressions {

	int operate(int a, int b, MathOperations math) {
		return math.operation(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LambdaExpressions l = new LambdaExpressions();

		// with type declaration
		MathOperations addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperations subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperations multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperations division = (int a, int b) -> a / b;

		System.out.println("10 + 5 = " + l.operate(10, 5, addition));
		System.out.println("10 - 5 = " + l.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + l.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + l.operate(10, 5, division));

		GreetingService g = a -> System.out.println("hello " + a);

		g.sayMessage("Shivam");


	}

}
