/*SortedSet is the alternate of Set interface that provides a total ordering on its elements. 
 * The elements of the SortedSet are arranged in the increasing (ascending) order. 
 * The SortedSet provides the additional methods that inhibit the natural ordering of the elements.
 * 
 * 
 */

package javacollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetInterfaceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> s = new TreeSet<>();

		s.add("Shivam");
		s.add("Saurabh");
		// s.add(null);
		// s.add(null);// doesn't take null values
		s.add("Harman");
		s.add("Saurabh"); // doesn't take duplicate values

		for (String i : s) {
			System.out.println(i);
		}
	}

}
