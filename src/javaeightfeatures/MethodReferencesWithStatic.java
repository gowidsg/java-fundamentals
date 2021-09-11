/*
 * 
 * Java provides a new feature called method reference in Java 8. 
 * Method reference is used to refer method of functional interface.
 *  It is compact and easy form of lambda expression. 
 *  Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference. 
 *There are following types of method references in java:

Reference to a static method.
Reference to an instance method.
Reference to a constructor.
 *
 */

package javaeightfeatures;

interface Speakable {
	void speak();

}

public class MethodReferencesWithStatic {

	public static void saySomething() {
		System.out.println("Hello this is static method.");
	}

	public static void ThreadStatus() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		// In the following example, we have defined a functional interface and
		// referring a static method to it's functional method speak().

		// referencing static method
		Speakable sp = MethodReferencesWithStatic::saySomething;
		// calling interface method
		sp.speak();

		//referencing static method to thread 
		Thread t = new Thread(MethodReferencesWithStatic::ThreadStatus);
		t.start();
	}

}
