/*
 * finalize is the method in Java which is used to perform clean up processing just before object is garbage collected.
 * 
 * finalize() method is used with the objects.
 * 
 */
package miscellaneous;

public class FinalizeMethod {

	protected void finalize() {
		System.out.println("Calling finalize method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeMethod fk = new FinalizeMethod();
		System.out.println("hashcode : " + fk.hashCode());
		fk = null;
		System.gc();
		System.out.println("End garbage collection");
	}

}
