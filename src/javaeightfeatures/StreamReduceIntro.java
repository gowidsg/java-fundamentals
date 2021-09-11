/*
 * This method takes a sequence of input elements and combines them into a single summary result by repeated operation. 
 * For example, finding the sum of numbers, or accumulating elements into a list.
 */

package javaeightfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamReduceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1, "Shivam", 20000f));
		emplist.add(new Employee(2, "Satyam", 25000f));
		emplist.add(new Employee(3, "Saurabh", 22800f));
		emplist.add(new Employee(4, "Ankit", 30000f));

		Float totalSalary = emplist.stream().map(p -> p.salary).reduce(0.0f, Float::sum);
		System.out.println("Using reduce to sum salary: "+totalSalary);

		double totalSal = emplist.stream().collect(Collectors.summingDouble(p -> p.salary));
		System.out.println("Using collect to sum salary: "+totalSal);
		
		Employee maximumSal = emplist.stream().max((p1,p2)->p1.salary>p2.salary?1:-1).get();
		
		Employee minimumSal = emplist.stream().min((p1,p2)->p1.salary>p2.salary?1:-1).get();
		
		System.out.println("Maximum salary: "+maximumSal.salary+"\nMinimum salary: "+minimumSal.salary);
	
		long count = emplist.stream().filter(p->p.salary>20000).count();
		System.out.println("Count method in stream : "+count);
		
		System.out.println("Converting list to set using stream");
		Set<Employee> set = emplist.stream().collect(Collectors.toSet());
		set.forEach(p->{System.out.println(p.id+" "+p.name);});
		
		java.util.Map<Integer,String> map = emplist.stream().collect(Collectors.toMap(p->p.id, p->p.name));
		System.out.println(map);
		
	}

}
