/*If you want to represent any object as a string, toString() method comes into existence.

The toString() method returns the String representation of the object.

If you print any object, Java compiler internally invokes the toString() method on the object. 
So overriding the toString() method, returns the desired output, it can be the state of an object etc. depending on your implementation.
 * 
 * 
 */

package miscellaneous;

class Emp {
	int eid;
	String ename;

	Emp(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}

	public String toString() {
		return "ID: " + eid + "\nName: " + ename;

	}
}

public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringMethod t = new ToStringMethod();
		System.out.println(t);// miscellaneous.ToStringMethod@15db9742 //without
								// overriding toString Method

		Emp e = new Emp(1, "Saurabh");
		System.out.println(e);
		// after overriding toString Method
		// ID: 1
		// Name: Saurabh
	}

}
