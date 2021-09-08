/*
 * A class which is declared with the abstract keyword is known as an abstract class in Java.
 * It can have abstract and non-abstract methods (method with the body).
 * 
 * 
 * Abstraction is a process of hiding the implementation details and showing only functionality to the user.
 * Abstraction lets you focus on what the object does instead of how it does it.
 * 
 * There are two ways to achieve abstraction in java
 * Abstract class (0 to 100%)
 * Interface (100%)
 * 
 * An abstract class must be declared with an abstract keyword.
 * It can have abstract and non-abstract methods.
 * It cannot be instantiated.
 * It can have constructors and static methods also.
 * It can have final methods which will force the subclass not to change the body of the method.
 * 
 * Note: It is not necessary if a class is derived as abstract but haven't any abstract method
 */

package abstractclass;

abstract class Planet {
	String s = "galaxy";

	abstract void display();

	Planet() {
		System.out.println("Planet Abstract Class Constructor");
	}

	final void noOfPlanets() {
		System.out.println("8 planets");
	}

	static void show() {
		System.out.println("Planet");
	}
}

public class Earth extends Planet {
	@Override
	void display() {
		System.out.println("From Earth");
		// TODO Auto-generated method stub

	}

	// Can't override final method

	// void noOfPlanets(){
	//
	// }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet p = new Earth();
		System.out.println(p.s);
		Planet.show();
		p.noOfPlanets();
		p.display();
	}

}
