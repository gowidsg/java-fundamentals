/*
 * Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
 * In this process, an overridden method is called through the reference variable of a superclass. 
 * The determination of the method to be called is based on the object being referred to by the reference variable.
 * 
 * 
 * We are calling the run method by the reference variable of Parent class. 
 * Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.
 * 
 * Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.
 */

package runtimepolymorphism;

class Bike {
	int speed = 90;

	void run() {
		System.out.println("Running Bike");
	}
}

public class PassionPro extends Bike {
	int speed = 120;

	void run() {
		System.out.println("Running Passion Pro");
	}

	public static void main(String[] args) {
		// Upcasting

		// If the reference variable of Parent class refers to the object of
		// Child class, it is known as upcasting.

		Bike b = new PassionPro(); // upcasting
		b.run();
		// Runtime polymorphism can't be achieved by data members.
		System.out.println(b.speed); // 90

	}

}
