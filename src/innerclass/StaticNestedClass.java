/*
 * A static class is a class that is created inside a class, is called a static nested class in Java. 
 * It cannot access non-static data members and methods. It can be accessed by outer class name.

It can access static data members of the outer class, including private.
The static nested class cannot access non-static (instance) data members or
 */

package innerclass;

public class StaticNestedClass {
	static private int data = 30;
	int value = 60;

	static class InnerClass {
		void display() {
			System.out.println(data);
			// System.out.println(value); //can't access non static member or
			// method
		}

		static void show() {
			System.out.println("static method");
		}
	}

	public static void main(String[] args) {
		// In this example, you need to create the instance of static nested
		// class because it has instance method msg(). But you don't need to
		// create the object of the Outer class because the nested class is
		// static and static properties, methods, or classes can be accessed
		// without an object.
		StaticNestedClass.InnerClass obj = new StaticNestedClass.InnerClass();
		obj.display();
		
		StaticNestedClass.InnerClass.show();

	}

}
