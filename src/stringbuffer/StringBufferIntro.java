/*
 * Java StringBuffer class is used to create mutable (modifiable) String objects. 
 * The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
 * 
 * Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously. So it is safe and will result in an order.
 * A String that can be modified or changed is known as mutable String. StringBuffer and StringBuilder classes are used for creating mutable strings.
 */

package stringbuffer;

public class StringBufferIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer();
		System.out.println("Object Type: " + sb.getClass().getName() + "\nValue of sb: " + sb.toString());

		sb = new StringBuffer("Hi");
		System.out.println("Object Type: " + sb.getClass().getName() + "\nValue of sb: " + sb.toString());

		sb = new StringBuffer(20);
		System.out.println("Object Type: " + sb.getClass().getName() + "\nCapacity of sb: " + sb.capacity());
	}

}
