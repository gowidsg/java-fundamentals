/*
 * Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, with predictable iteration order. It inherits HashMap class and implements the Map interface.
 * 
 * Points to remember
Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 
 *
 */
package javaeightfeatures;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapIntro {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(100, "Amit");
		hm.put(101, "Shivam");
		hm.put(102, "Satyam");
		for(Map.Entry m: hm.entrySet() ){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println("Key Value pairs:-"+hm.entrySet());
		
	}

}
