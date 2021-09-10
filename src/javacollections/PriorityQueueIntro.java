/*
 * The PriorityQueue class implements the Queue interface. 
 * It holds the elements or objects which are to be processed by their priorities. 
 * PriorityQueue doesn't allow null values to be stored in the queue.
 */

package javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueIntro {

	public static void main(String[] args) {
		// The PriorityQueue class provides the facility of using queue. But it
		// does not orders the elements in FIFO manner.
		// It inherits AbstractQueue class.
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Shivam");
		pq.add("Suarabh");
		pq.add("Prateek");
		pq.add("Aditi");
		// pq.add(null); null value not allow

		System.out.println("head: " + pq.element());
		System.out.println("head: " + pq.peek());

		System.out.println(pq);

		// Iterator<String> itr = pq.iterator();
		//
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		// }

	}

}
