/*
 * Queue interface maintains the first-in-first-out order. 
 * It can be defined as an ordered list that is used to hold the elements which are about to be processed. 
 * There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
 */

package javacollections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> pq = new PriorityQueue<>();
		Queue<String> aq = new ArrayDeque<>();

		pq.add("p1");
		pq.add("p2");
		pq.add("p3");
		pq.add("p6");
		pq.add("p5");
		
		for (String i : pq) {
			System.out.print(i+" ");
		}
		
		pq.remove();
		pq.poll();
		
		System.out.println("\nAfter removing two elements");
		for (String i : pq) {
			System.out.print(i+" ");
		}


	}

}
