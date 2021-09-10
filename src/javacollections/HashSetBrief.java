/*
 * Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
The initial default capacity of HashSet is 16, and the load factor is 0.75.
 */
package javacollections;

import java.util.HashSet;
import java.util.Iterator;

class Book {
	int bid;
	String author;

	Book(int bid, String author) {
		this.bid = bid;
		this.author = author;
	}
}

public class HashSetBrief {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Four");
		set.add("Five");
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		Book b1 = new Book(1, "Goel");
		Book b2 = new Book(2, "S Chand");

		HashSet<Book> b = new HashSet<>();
		b.add(b1);
		b.add(b2);

		for (Book book : b) {
			System.out.println(book.bid + " " + book.author);
		}

	}

}
