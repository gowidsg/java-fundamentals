/*
 * The stack is the subclass of Vector. 
 * It implements the last-in-first-out data structure, i.e., Stack. 
 * The stack contains all of the methods of Vector class and also provides its methods like boolean push(), boolean peek(), boolean push(object o), which defines its properties.
 */

package javacollections;

import java.util.Iterator;
import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<>();
		s.push("first");
		s.push("second");
		s.add("third");
		System.out.println("Element at the top of stack: " + s.peek());
		System.out.println("Element removed from top of stack: " + s.pop());
		System.out.println("Remaining elemnents");
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
