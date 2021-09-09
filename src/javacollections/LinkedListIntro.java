/*
 * LinkedList implements the Collection interface. 
 * It uses a doubly linked list internally to store the elements. 
 * It can store the duplicate elements. 
 * It maintains the insertion order and is not synchronized. 
 * In LinkedList, the manipulation is fast because no shifting is required.
 */

package javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIntro {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Hi");
		list.add("HI");
		list.add("Bye");
		list.addFirst("At first position");
		list.addLast("At last pos");
		// list.addAll(list);

		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
