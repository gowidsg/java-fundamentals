/*
 * List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.
 * 
 */
package javacollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		List<String> l2 = new LinkedList<>();
		List<Integer> l3 = new Vector<>();
		List<Boolean> l4 = new Stack<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(4);
		
		for(Integer i : l1){
			System.out.println(i);
		}
	}

}
