//Since Java 8, we can have method body in interface. But we need to make it default method. 

package interfaceinjava;

interface Manageable {
	default void msg() {
		System.out.println("Default Method in interface having body");
	}
}

public class DefaultMethod implements Manageable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manageable m = new DefaultMethod();
		m.msg();
	}

}
