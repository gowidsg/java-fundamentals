/*
 * Java provides a new additional package in Java 8 called java.util.stream. This package consists of classes, interfaces and enum to allows functional-style operations on the elements. You can use stream by importing java.util.stream package.

Stream provides following features:

Stream does not store elements. It simply conveys elements from a source such as a data structure, an array, or an I/O channel, through a pipeline of computational operations.
Stream is functional in nature. Operations performed on a stream does not modify it's source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
Stream is lazy and evaluates code only when required.
The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
You can use stream to filter, collect, print, and convert from one data structure to other etc. In the following examples, we have apply various operations with the help of stream.
 */

package javaeightfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	int id;
	float salary;
	String name;

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class StreamAPIIntro {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1, "Shivam", 20000f));
		emplist.add(new Employee(2, "Satyam", 25000f));
		emplist.add(new Employee(3, "Saurabh", 22800f));
		emplist.add(new Employee(4, "Ankit", 30000f));

		List<Float> sal =emplist.stream().filter(p->p.salary>20000).map(p->p.salary).collect(Collectors.toList());
		
		System.out.println(sal);
	}

}
