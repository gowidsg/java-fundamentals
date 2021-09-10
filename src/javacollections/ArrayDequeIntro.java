/*
 * ArrayDeque class implements the Deque interface. 
 * It facilitates us to use the Deque. 
 * Unlike queue, we can add or delete the elements from both the ends.
 * 
 * ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
 * The important points about ArrayDeque class are:

Unlike Queue, we can add or remove elements from both sides.
Null elements are not allowed in the ArrayDeque.
ArrayDeque is not thread safe, in the absence of external synchronization.
ArrayDeque has no capacity restrictions.
ArrayDeque is faster than LinkedList and Stack.
 *
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
		// a.add(null); null not allowed

		a.removeLast();

		Iterator<String> i = a.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		a.offer("add last");
		a.offerFirst("add in first");
		a.offerLast("add last 2");

		System.out.println(a);
		System.out.println("Get first: " + a.getFirst() + "  Get last: " + a.getLast());

		System.out.println("pop: " + a.pop() + " pollfirst : " + a.pollFirst() + " poll : " + a.poll() + "poll last : "
				+ a.pollLast());
	}

}
