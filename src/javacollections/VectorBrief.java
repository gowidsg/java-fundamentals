/*
 * 1) ArrayList is not synchronized.	Vector is synchronized.
2) ArrayList increments 50% of current array size if the number of elements exceeds from its capacity.	Vector increments 100% means doubles the array size if the total number of elements exceeds than its capacity.
3) ArrayList is not a legacy class. It is introduced in JDK 1.2.	Vector is a legacy class.
4) ArrayList is fast because it is non-synchronized.	Vector is slow because it is synchronized, i.e., in a multithreading environment, it holds the other threads in runnable or non-runnable state until current thread releases the lock of the object.
5) ArrayList uses the Iterator interface to traverse the elements.	A Vector can use the Iterator interface or Enumeration interface to traverse the elements.
 */

package javacollections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorBrief {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();// creating vector
		v.add("shivam");// method of Collection
		v.addElement("satyam");// method of Vector
		v.addElement("saurabh");
		// traversing elements using Enumeration
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
