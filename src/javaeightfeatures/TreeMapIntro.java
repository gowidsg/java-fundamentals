/*
 * Java TreeMap class is a red-black tree based implementation. It provides an efficient means of storing key-value pairs in sorted order.

The important points about Java TreeMap class are:

Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
Java TreeMap contains only unique elements.
Java TreeMap cannot have a null key but can have multiple null values.
Java TreeMap is non synchronized.
Java TreeMap maintains ascending order.
 */
package javaeightfeatures;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapIntro {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(100, "Apple");
		map.put(105, "Orange");
		map.put(102, "Banana");
		map.put(104, "Pineapple");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		map.remove(102);
		System.out.println("After Removing 102: " + map.entrySet());
		map.put(102, null);
		map.put(103, "Guava");

		System.out.println("Descending map or Reverse order: " + map.descendingMap());
		System.out.println("headMap: " + map.headMap(103));
		System.out.println("tailmap: " + map.tailMap(103));

		System.out.println("Submap: " + map.subMap(102, 105));

		// map.put(null, "Null"); cannot contain null key
	}

}
