/*
 * Java HashMap class implements the Map interface which allows us to store key and value pair, 
 * where keys should be unique. If you try to insert the duplicate key, 
 * it will replace the element of the corresponding key. 
 * It is easy to perform operations using the key index like updation, deletion, etc. 
 * HashMap class is found in the java.util package.
 * 
 * HashMap in Java is like the legacy Hashtable class, 
 * but it is not synchronized. 
 * It allows us to store the null elements as well, 
 * but there should be only one null key. 
 * Java HashMap contains values based on the key.
 * 
 *Points to remember 
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.


 */

package javacollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Banana");
		map.put(2, "Apple");
		// You cannot store duplicate keys in HashMap. However, if you try to
		// store duplicate key with another value, it will replace the value.
		map.put(4, "Pineapple");
		map.put(4, "Mango");
		map.put(null, null);
		map.put(null, "null");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.putIfAbsent(5, "Orange");
		HashMap<Integer, String> newmap = new HashMap<>();
		newmap.putAll(map);
		System.out.println(newmap);
		System.out.println("Removing:");
		newmap.remove(null);
		newmap.remove(1, "Banana");

		System.out.println(newmap);
		newmap.replace(2, "PineApple");
		newmap.replace(4, "Mango", "Cherry");
		System.out.println(newmap);
		System.out.println("Replacing all values:-");
		newmap.replaceAll((k, v) -> "Orange");
		System.out.println(newmap);
	}

}
