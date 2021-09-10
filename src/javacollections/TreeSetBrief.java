//Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.
//
//The important points about Java TreeSet class are:
//
//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
//Java TreeSet class is non synchronized.
//Java TreeSet class maintains ascending order lexicographically.
package javacollections;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class TreeSetBrief {

	public static void main(String[] args) {

		TreeSet<String> s = new TreeSet<>();
		s.add("Apple");
		s.add("Mango");
		s.add("Guava");
		s.add("cherry");
		s.add("Guava");
		s.add("Banana");
		s.add("pineapple");
		// s.add(null); null are not allowed

		System.out.println(s);

		System.out.println("Celiling: " + s.ceiling("Hi") + "\nFloor: " + s.floor("Hi"));

		System.out.println("Subset:" + s.subSet("Apple", "Guava"));
		s.forEach(a -> {
			System.out.print(a + " ");
		});

		System.out.println("\n" + s.equals(s));

		System.out.println("higher(): " + s.higher("Guava") + "\nlower() : " + s.lower("Guava"));

		String[] fruit = s.toArray(new String[s.size()]);

		for (String f : fruit) {
			System.out.print(f + " ");
		}

		TreeSet<String> newls = new TreeSet<>();
		for (String f : fruit) {
			newls.add(f);
		}

		System.out.println("\n" + newls);

		System.out.println("Reverse Set:" + newls.descendingSet());//doesn't change the order permanent
		
		System.out.println(newls);
		System.out.println("head set: "+newls.headSet("Mango"));//exclusive
		System.out.println("tailSet: "+newls.tailSet("Mango"));//inclusive
	
	}

}
