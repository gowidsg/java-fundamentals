package javaeightfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Book {
	int sid;
	String name;
	double price;

	Book(int sid, String name, double d) {
		this.sid = sid;
		this.name = name;
		this.price = d;
	}
}

public class LamdaWithCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1, "Maths", 22.20);
		Book b2 = new Book(2, "C++", 20.00);
		Book b3 = new Book(3, "ABC", 30.00);
		Book b4 = new Book(4, "English", 40.00);

		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);

		System.out.println("Sorting on name of book with compareTO method in lambda exp");

		Collections.sort(list, (a1, a2) -> {
			return a1.name.compareTo(a2.name);
		});

		for (Book b : list) {
			System.out.println(b.sid + " " + b.name + " " + b.price);
		}

		System.out.println("Using stream filter to filter the data:");
		Stream<Book> filtered_data = list.stream().filter(b -> b.price > 25);

		filtered_data.forEach(p -> {
			System.out.println(p.name + ":" + p.price);
		});
	}

}
