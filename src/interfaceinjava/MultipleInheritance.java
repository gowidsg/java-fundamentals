//If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.

package interfaceinjava;

interface Fixable {
	void fix();

	// multiple inheritance is not supported in the case of class because of
	// ambiguity. However, it is supported in case of an interface because there
	// is no ambiguity. It is because its implementation is provided by the
	// implementation class
	void create(); // defining same method in both interface
}

interface Creatable {
	void create();
}

public class MultipleInheritance implements Fixable, Creatable {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Creating");

	}

	@Override
	public void fix() {
		// TODO Auto-generated method stub
		System.out.println("Fixing");
	}

	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.create();
		m.fix();

		// TODO Auto-generated method stub

	}

}
