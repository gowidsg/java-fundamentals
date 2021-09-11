/*
 * Java introduced a new class Optional in jdk8. It is a public final class and used to deal with NullPointerException in Java application. You must import java.util package to use this class. It provides methods which are used to check the presence of value for particular variable.
 */
package javaeightfeatures;

import java.util.Optional;

public class OptionalClassIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[5];
		// throw null pointer exception
		// System.out.println(str[2].toLowerCase());
		Optional<String> checkNull = Optional.ofNullable(str[2]);
		if (checkNull.isPresent()) {
			System.out.println(str[2].toLowerCase());
		} else {
			System.out.println("String value not present");
		}
		str[4] = "Shivam";
		Optional<String> checkNull2 = Optional.ofNullable(str[4]);
		checkNull2.ifPresent(System.out::println);
		System.out.println(checkNull2.get());
	}

}
