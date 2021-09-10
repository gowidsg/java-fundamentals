/*
 * Entry is the subinterface of Map. 
 * So we will be accessed it by Map.Entry name. 
 * It returns a collection-view of the map, whose elements are of this class. It provides methods to get key and value
 */

package javacollections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapEntryInterfaceIntro {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(3, "B");
		map.put(2, "C");
		map.put(4, "d");
		// Returns a Set view of the mappings contained in this map
		map.entrySet()
				// Returns a sequential Stream with this collection as its
				// source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey())
				// Performs an action for each element of this stream
				.forEach(System.out::println);

		System.out.println("In descending order on key");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
				.forEach(System.out::println);

		System.out.println("on comparingByValue() in descending order");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(System.out::println);
	}

}
