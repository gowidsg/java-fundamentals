/*
 * Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.

Points to remember
A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
Java Hashtable class contains unique elements.
Java Hashtable class doesn't allow null key or value.
Java Hashtable class is synchronized.
The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
 */

package javacollections;

import java.util.Hashtable;
import java.util.Map;

class Animal {
	int aid;
	String name;

	Animal(int aid, String name) {
		this.aid = aid;
		this.name = name;
	}
}

public class HashTableIntro {

	public static void main(String[] args) {
		Hashtable<Integer, String> h = new Hashtable<>();
		h.put(100, "Honda");
		h.put(109, "Maruti");
		h.put(102, "Passion");
		h.put(105, "Suzuki");

		System.out.println(h.entrySet());

		System.out.println(h.getOrDefault(101, "Not found"));
		System.out.println(h.getOrDefault(102, "Not found"));

		h.putIfAbsent(103, "Platina");
		System.out.println(h.entrySet());

		Hashtable<Integer, Animal> animal = new Hashtable<>();
		animal.put(1, new Animal(1, "Giraffe"));
		animal.put(2, new Animal(2, "Elephant"));
		animal.put(3, new Animal(3, "Lion"));
//		animal.put(null, null); doesn't allow null key and value
	
		for(Map.Entry<Integer,Animal> entry:animal.entrySet()){
			int key = entry.getKey();
			Animal a = entry.getValue();
			System.out.println(key+" Details");
			System.out.println(a.aid+" "+a.name);
		}
	}

}
