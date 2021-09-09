/*
 * Vector uses a dynamic array to store the data elements. 
 * It is similar to ArrayList. 
 * However, It is synchronized and contains many methods that are not the part of Collection framework.
 */
package javacollections;

import java.util.Iterator;
import java.util.Vector;

public class VectorIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>();
		v.add("v1");
		v.add("v2");
		v.addElement("v1");

		Iterator<String> i = v.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
