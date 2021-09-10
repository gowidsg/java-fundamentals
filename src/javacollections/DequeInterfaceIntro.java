/*
 * Deque interface extends the Queue interface. 
 * In Deque, we can remove and add the elements from both the side. 
 * Deque stands for a double-ended queue which enables us to perform the operations at both the ends.
 */
package javacollections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeInterfaceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> d = new ArrayDeque<>();

		d.add("Shivam");
		d.addFirst("first");
		d.addLast("last");

		Iterator<String> i = d.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		d.offer("tail");

		System.out.println(d);

		System.out.println(d.poll() + " " + d.pollFirst() + " " + d.pollLast());
		
		System.out.println(d);

	}

}
