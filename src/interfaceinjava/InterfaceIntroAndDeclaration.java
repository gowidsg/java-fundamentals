/*An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.

It cannot be instantiated just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.

Why use Java interface?

There are mainly three reasons to use interface. They are given below.
It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.
 * 
 * An interface is declared by using the interface keyword. 
 * It provides total abstraction; means all the methods in an interface are declared with the empty body, 
 * and all the fields are public, static and final by default. 
 * A class that implements an interface must implement all the methods declared in the interface.
 * 
 * The Java compiler adds public and abstract keywords before the interface method. 
 * Moreover, it adds public, static and final keywords before data members.
 */

package interfaceinjava;

interface Showable {
	int count = 10; // public static final int count =0

	void show(); // public abstract void show()

}

public class InterfaceIntroAndDeclaration implements Showable {
	@Override
	public void show() {
		// count++; final data member
		System.out.println(count);
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable s = new InterfaceIntroAndDeclaration();
		s.show();

	}

}
