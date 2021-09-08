/*
 * Connecting a method call to the method body is known as binding.
 * 
 * There are two types of binding
 * Static Binding (also known as Early Binding).
 * Dynamic Binding (also known as Late Binding).
 * 
 * 
 * When type of the object is determined at compiled time(by the compiler), it is known as static binding.
 * If there is any private, final or static method in a class, there is static binding.
 */

package binding;

public class StaticBinding {

	public StaticBinding() {
		// TODO Auto-generated constructor stub
	}

	private void display() {
		System.out.println("Static Binding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBinding sb = new StaticBinding();
		sb.display();

	}

}
