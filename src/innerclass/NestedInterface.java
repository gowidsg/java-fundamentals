/*
 * An interface, i.e., declared within another interface or class, is known as a nested interface.
 * The nested interfaces are used to group related interfaces so that they can be easy to maintain.
 * The nested interface must be referred to by the outer interface or class. It can't be accessed directly.
 * 
 * There are given some points that should be remembered by the java programmer.

The nested interface must be public if it is declared inside the interface, 
but it can have any access modifier if declared within the class.
Nested interfaces are declared static
 
 * In the collection framework, the sun microsystem has provided a nested interface Entry. 
 * Entry is the subinterface of Map, i.e., accessed by Map.Entry.
 */
package innerclass;

interface Showable {
	void show();

	interface Printable {
		void print();
	}
}

// we can define an interface inside the class and how we can access it.
class A {
	interface Executable {
		void exec();
	}
}

public class NestedInterface implements Showable.Printable, A.Executable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("nested interfcae printable");

	}

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Executed method inside the nested interface of class A");

	}

	public static void main(String[] args) {
		Showable.Printable p = new NestedInterface();
		p.print();

		A.Executable aexc = new NestedInterface(); /// upcasting here
		aexc.exec();

		// Can we define a class inside the interface?
		// Yes, if we define a class inside the interface, the Java compiler
		// creates a static nested class. Let's see how can we define a class
		// within the interface:
	}

}
