package javacollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MethodOfIteratingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(20);
		list.add(13);
		list.add(16);
		list.add(25);

		// Iterator Class
		System.out.println("Using Iterator:-");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\nUsing ListIterator for printing reverse order:-");
		// ListIterator
		// in reverse order
		ListIterator<Integer> ls = list.listIterator(list.size());
		while (ls.hasPrevious()) {
			System.out.print(ls.previous() + " ");
		}

		// Using Loop
		System.out.println("\nUsing for loop:-");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		// Using forEach() Method
		System.out.println("\nUsing forEach() Method:- ");
		list.forEach(i -> {
			System.out.print(i + " "); // lambda function
		});

		// Using forEachRemaining() method
		System.out.println("\nUsing forEachRemaining() method:- ");
		Iterator<Integer> itr2 = list.iterator();
		itr2.forEachRemaining(a -> {
			System.out.print(a + " ");
		});

		// USing for Each loop
		System.out.println("\nUsing for each loop:-");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
