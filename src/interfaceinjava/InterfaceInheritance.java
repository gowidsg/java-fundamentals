package interfaceinjava;

interface Showing {
	void show();
}

interface Displaying extends Showing {
	void display();
}

public class InterfaceInheritance implements Displaying {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show method of root interface");

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display Method of immediate parent interface");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceInheritance i = new InterfaceInheritance();
		i.display();
		i.show();

	}

}
