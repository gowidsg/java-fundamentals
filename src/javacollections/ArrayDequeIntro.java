/*
 * ArrayDeque class implements the Deque interface. 
 * It facilitates us to use the Deque. 
 * Unlike queue, we can add or delete the elements from both the ends.
 * 
 * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
 */

package javacollections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<String> a = new ArrayDeque<>();
		a.add("Shivam");
		a.addFirst("first");
		a.addLast("last");
		a.addLast("last2");

		a.removeLast();

		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
