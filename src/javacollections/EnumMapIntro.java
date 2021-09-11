//Java EnumMap class is the specialized Map implementation for enum keys. It inherits Enum and AbstractMap classes.
package javacollections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapIntro {

	public static void main(String[] args) {
		// days are defined in EnumSetIntro.java file
		EnumMap<days, String> map = new EnumMap<>(days.class);

		map.put(days.Mon, "1");
		map.put(days.Tue, "2");
		map.put(days.Wed, "3");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
