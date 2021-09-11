/*
 * An Interface that contains exactly one abstract method is known as functional interface. 
 * It can have any number of default, static methods but can contain only one abstract method. 
 * It can also declare methods of object class.

Functional Interface is also known as Single Abstract Method Interfaces or SAM Interfaces. 
It is a new feature in Java, which helps to achieve functional programming approach.
 */
package javaeightfeatures;

//A functional interface can extends another interface only when it does not
//have any abstract method.
interface Increasable {
	default void inc() {
		System.out.println("increase the speed");
	}

}

interface Runnable extends Increasable {
	// It can contain any number of Object class methods.
	int hashCode();

	String toString();

	boolean equals(Object obj);

	void run(int speed);
}

public class FunctionalInterfaces implements Runnable {

	public static void main(String[] args) {

		FunctionalInterfaces f = new FunctionalInterfaces();
		f.run(90);
		f.inc();
	}

	@Override
	public void run(int speed) {
		System.out.println("Speed is :" + speed);
	}

	// You can also define your own custom functional interface. Following is the
	// list of functional interface which are placed in java.util.function
	// package.

}
