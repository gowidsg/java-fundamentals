package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Emp {
	int eid;
	String ename;

	Emp(int eid, String ename) {
		this.eid = eid;
		this.ename = ename;
	}
}

public class ArrayListBrief {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		

		// addAll()
		ArrayList<Integer> newlist = new ArrayList<>();
		newlist.addAll(list);
		System.out.println(newlist);

		// add(1,9)
		newlist.add(1, 9);

		newlist.add(4);
		newlist.add(5);
		System.out.println(newlist);

		// remove() with index
		newlist.remove(1);
		System.out.println(newlist);

		newlist.addAll(list);
		System.out.println(newlist);
		// remove object
		newlist.remove((Integer) 3);
		System.out.println(newlist);

		// removeAll() with collection remove all the occurence.
		newlist.removeAll(list);
		System.out.println(newlist);

		newlist.removeIf(in -> in.equals(4));

		System.out.println(newlist);

		System.out.println(newlist.isEmpty());

		newlist.addAll(list);
		newlist.retainAll(list);

		System.out.println(newlist);

		List<Integer> list2;

		list2 = newlist.subList(0, 1);
		System.out.println(list2);

		System.out.println(list2.getClass().getName());

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

	
	}

}
