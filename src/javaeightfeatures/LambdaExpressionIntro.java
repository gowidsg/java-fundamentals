/*
 * Lambda expression is a new and important feature of Java which was included in Java SE 8. It provides a clear and concise way to represent one method interface using an expression. It is very useful in collection library. It helps to iterate, filter and extract data from collection.

The Lambda expression is used to provide the implementation of an interface which has functional interface. It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. Here, we just write the implementation code.

Java lambda expression is treated as a function, so compiler does not create .class file.

Lambda expression provides implementation of functional interface. 
An interface which has only one abstract method is called functional interface. Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.

(argument-list) -> {body} 

Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.

 * 
 */

package javaeightfeatures;

import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

@FunctionalInterface
interface Drawable {
	public void draw();
}

@FunctionalInterface
interface Sayable {
	public String say();
}

interface Addable {
	public int add(int a, int b);
}

public class LambdaExpressionIntro {

	public static void main(String[] args) {
		String shape = "Rectangle";

		// with lambda
		Drawable d = () -> {
			System.out.println("Drawing " + shape);
		};
		d.draw();
		// with no argument
		Sayable s = () -> {
			return "Shivam saying";
		};
		System.out.println(s.say());

		// with datatype
		Addable add = (int a, int b) -> {
			return a + b;
		};

		System.out.println(add.add(2, 4));

		// without datatype and add return statement by default
		Addable ad2 = (a, b) -> (a + b);
		System.out.println(ad2.add(10, 20));

		List<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("My name is");
		list.add("Shivam");
		
		list.forEach(l->{System.out.println(l);});
	}

}
