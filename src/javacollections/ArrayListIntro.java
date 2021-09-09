/*
 * The ArrayList class implements the List interface. 
 * It uses a dynamic array to store the duplicate element of different data types. 
 * The ArrayList class maintains the insertion order and is non-synchronized. 
 * The elements stored in the ArrayList class can be randomly accessed. 
 */
package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student {
	int rollNo;
	String name;

	Student(int rollNo, String name) {
		this.name = name;
		this.rollNo = rollNo;
	}
}

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> name = new ArrayList<>();
		name.add("Shivam");
		name.add("Satyam");
		name.add("Saurabh");
		System.out.println("Element at index 1: " + name.get(1));

		Iterator itr = name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		name.set(2, "Saurabh Singh");

		System.out.println(name);
		Collections.sort(name);
		System.out.println("Sorting array list: " + name);

		Student s1 = new Student(1, "Yadav");
		Student s2 = new Student(2, "Gupta");

		ArrayList<Student> stu = new ArrayList<Student>();
		stu.add(s1);
		stu.add(s2);

		Iterator st = stu.iterator();
		while (st.hasNext()) {
			Student str = (Student) st.next();
			System.out.println(str.rollNo + " " + str.name);
		}

	}

}
