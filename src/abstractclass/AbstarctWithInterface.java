/*
 * The abstract class can also be used to provide some implementation of the interface. 
 * In such case, the end user may not be forced to override all the methods of the interface.
 */

package abstractclass;

interface Runnable {
	void runA();

	void runB();

	void runC();
}

abstract class Run implements Runnable {
	public void runA() {
		System.out.println("I am A");
	}
}

public class AbstarctWithInterface extends Run {
	public void runB() {
		System.out.println("I am B");
	}
	
	public void runC() {
		System.out.println("I am C");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new AbstarctWithInterface();
		r.runA();
		r.runB();
		r.runC();
	}

}
