/*Java EnumSet class is the specialized Set implementation for use with enum types. It inherits AbstractSet class and implements the Set interface.
*/
package javacollections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	Sun, Mon, Tue, Wed, Thurs, Fri, Sat
}

public class EnumSetIntro {

	public static void main(String[] args) {
		Set<days> set = EnumSet.of(days.Tue, days.Wed);
		
		Iterator<days>itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		Set<days> set2 = EnumSet.allOf(days.class);
		System.out.println(set2);

		Set<days> set3 = EnumSet.noneOf(days.class);
		System.out.println(set3);

	}

}
