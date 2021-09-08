//An interface which has no member is known as a marker or tagged interface, 
//for example, Serializable, Cloneable, Remote, etc. 
//They are used to provide some essential information to the JVM so that JVM may perform some useful operation.

package interfaceinjava;

interface Shop {

}

/*
 * An interface can have another interface which is known as a nested interface.
 * We will learn it in detail in the nested classes
 * 
 */

interface ModeofTransport {
	void mode();

	interface ByLand {
		void landMsg();
	}
}

public class MarkerOrTaggedInterface implements Shop, ModeofTransport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarkerOrTaggedInterface m = new MarkerOrTaggedInterface();
		m.mode();

	}

	@Override
	public void mode() {
		// TODO Auto-generated method stub
		System.out.println("Mode of Transport");

	}

}
