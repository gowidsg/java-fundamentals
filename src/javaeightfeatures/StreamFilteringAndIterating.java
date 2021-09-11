package javaeightfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilteringAndIterating {

	public static void main(String[] args) {
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1, "Shivam", 20000f));
		emplist.add(new Employee(2, "Satyam", 25000f));
		emplist.add(new Employee(3, "Saurabh", 22800f));
		emplist.add(new Employee(4, "Ankit", 30000f));

		emplist.stream().filter(p -> p.id > 1).forEach(p -> {
			System.out.println(p.id+" "+p.name);
		});
	}

}
