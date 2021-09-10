/*
 * Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure.
 *  It inherits the AbstractList class and implements List and Deque interfaces.

The important points about Java LinkedList are:

Java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.
Java LinkedList class can be used as a list, stack or queue.
 */

package javacollections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListBrief {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l = new LinkedList<>();
		l.add("Shivam");
		l.addFirst("Mr");
		l.addLast("Gupta");

		LinkedList<String> l2 = new LinkedList<>();

		l2.addAll(l);

		l2.removeFirst();
		l2.removeLast();

		l2.removeIf(s -> s.equals("Shivam"));

		l2.isEmpty();

		l2.addAll(l);
		l2.addAll(l);

		System.out.println(l2);

		l2.removeFirstOccurrence("Mr");
		l2.removeLastOccurrence("Gupta");

		System.out.println(l2);
		System.out.println(l2.element());

		l2.clear();
		System.out.println(l2.isEmpty());

		l2.addAll(l);

		l2.retainAll(l);
		System.out.println(l2);

		@SuppressWarnings("unchecked")
		LinkedList<String> l3 = (LinkedList<String>) l2.clone();

		l3.addFirst("Hi");
		System.out.println(l3);

		System.out.println("peek : " + l3.peek() + "\npeekFirst : " + l3.peekFirst());

		System.out.println("hashcode : " + l3.hashCode());
		l3.offerFirst("OfferFirst");
		l3.offerLast("offerLast");
		l3.offer("offer");
		System.out.println(l3);

		Collections.sort(l2, Collections.reverseOrder());
		System.out.println(l2);

		System.out.println("poll: " + l2.poll() + "\npop: " + l2.pop());
		// retrieve and delete first element of stack
		l2.push("Satyam");// push element onto the top of stack
		System.out.println(l2 + "\nsize: " + l2.size());

		String[] arr = l2.toArray(new String[l2.size()]);
		for (String s : arr) {
			System.out.println(s);
		}

	}

}
