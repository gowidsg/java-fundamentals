/*
 * Java TreeSet class implements the Set interface that uses a tree for storage. 
 * Like HashSet, TreeSet also contains unique elements. 
 * However, the access and retrieval time of TreeSet is quite fast. 
 * The elements in TreeSet stored in ascending order.
 */

package javacollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<>();
		t.add("One");
		t.add("Two");
		t.add("one");
		t.add("two");
		t.add("Three");
		Iterator<String> itr = t.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
