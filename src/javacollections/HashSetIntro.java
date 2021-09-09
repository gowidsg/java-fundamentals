/*
 * HashSet class implements Set Interface. 
 * It represents the collection that uses a hash table for storage. 
 * Hashing is used to store the elements in the HashSet. It contains unique items.
 */
package javacollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<>();
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
