/*
 * The PriorityQueue class implements the Queue interface. 
 * It holds the elements or objects which are to be processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.
 */

package javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Shivam");
		pq.add("Suarabh");
		pq.add("Prateek");
		pq.add("Aditi");

		System.out.println("head: " + pq.element());
		System.out.println("head: " + pq.peek());

		Iterator<String> itr = pq.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
