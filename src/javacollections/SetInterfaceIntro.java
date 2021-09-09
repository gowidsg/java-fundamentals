/*
 * 
 * Set Interface in Java is present in java.util package. 
 * It extends the Collection interface. 
 * It represents the unordered set of elements which doesn't allow us to store the duplicate items. 
 * We can store at most one null value in Set. 
 * Set is implemented by HashSet, LinkedHashSet, and TreeSet.
 */

package javacollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = new LinkedHashSet<>();
		Set<String> s3 = new TreeSet<>();
		s1.add(null);
		s1.add(null);//doesn't allow to add duplicate values or null
		s1.add("Sihvam");
		s1.add("Sihvam");
		

		for (String i : s1) {
			System.out.println(i);
		}
	}

}
