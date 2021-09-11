/*
 * Java provides a facility to create default methods inside the interface. 
 * Methods which are defined inside the interface and tagged with default are known as default methods. These methods are non-abstract methods.
 */

package javaeightfeatures;

@FunctionalInterface
interface Defaulter {
	default void greet() {
		System.out.println("This is default method in interface");
	}

	void salutations(String msg);

	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class DefaultMethodsInInterface implements Defaulter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodsInInterface dm = new DefaultMethodsInInterface();
		dm.greet();
		dm.salutations("Good Morning");
		Defaulter.sayLouder("Hello Static method");
	}

	@Override
	public void salutations(String msg) {
		System.out.println(msg);
	}

	// After having default and static methods inside the interface, we think
	// about the need of abstract class in Java. An interface and an abstract
	// class is almost similar except that you can create constructor in the
	// abstract class whereas you can't do this in interface.

}
