/*
 * LinkedHashSet class represents the LinkedList implementation of Set Interface. 
 * It extends the HashSet class and implements Set interface. 
 * Like HashSet, It also contains unique elements. 
t maintains the insertion order and permits null elements.
 */
package javacollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> h = new LinkedHashSet<>();
		h.add(null);
		h.add("Maths");
		h.add("Science");
		h.add("Science");
		h.add("maths");
		Iterator<String> i = h.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
