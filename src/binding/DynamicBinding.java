package binding;

class Binding {
	void display() {
		System.out.println("Binding");
	}
}

public class DynamicBinding extends Binding {

	public DynamicBinding() {
		// TODO Auto-generated constructor stub

	}

	void display() {
		System.out.println("Dynamic Binding");
	}

	public static void main(String[] args) {
		// here object type can't be defined by the compiler because instance of
		// binding is also an instance of Dynamic Binding
		Binding b = new DynamicBinding();
		// So compiler doesn't know its type, only its base type.
		b.display();
	}

}
