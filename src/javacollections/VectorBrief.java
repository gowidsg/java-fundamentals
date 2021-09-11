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
