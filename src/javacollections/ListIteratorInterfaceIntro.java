package javacollections;
import java.util.*;
public class ListIteratorInterfaceIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<String>();
		ls.add("l1");
		ls.add("l2");
		ls.add("l3");
		ls.add("l4");
		ls.add(null);
		
		System.out.println(ls);
		ListIterator<String> ltr = ls.listIterator();
		while(ltr.hasNext()){
			System.out.printf("Element at Index %d is : %s\n",ltr.nextIndex(),ltr.next());
		}

		System.out.println("Printing in backward direction");
		while(ltr.hasPrevious()){
			System.out.print(ltr.previous()+" ");
		}
	}

}
