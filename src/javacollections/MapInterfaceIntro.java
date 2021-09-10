/*
 * A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. 
 * A Map contains unique keys.
 * A Map is useful if you have to search, update or delete elements on the basis of a key.
 *
 *There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, LinkedHashMap, and TreeMap. The hierarchy of Java Map is given below:
 *
 *A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
 *
 *A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
 */
package javacollections;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceIntro {

	public static void main(String[] args) {
		// Sort on the basis of key in ascending order by default
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(3, "B");
		map.put(2, "C");
		map.put(4, "d");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	
	}

}
