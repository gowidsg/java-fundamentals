/*
 * Java added a new final class StringJoiner in java.util package. It is used to construct a sequence of characters separated by a delimiter. Now, you can create string by passing delimiters like comma(,), hyphen(-) etc. You can also pass prefix and suffix to the char sequence.
 */

package javaeightfeatures;

import java.util.StringJoiner;

public class StringJoinerIntro {

	public static void main(String[] args) {
		StringJoiner names = new StringJoiner("|");
		names.add("Shivam");
		names.add("Satyam");
		names.add("Saurabh");
		names.add("Shiva");
		names.add("Sattu");
		names.add("Amit");
		System.out.println(names);

		System.out.println("Adding prefix and suffix as{}");
		StringJoiner fruits = new StringJoiner("|", "{", "}");
		fruits.add("Apple");
		fruits.add("Orange");
		System.out.println(fruits);
		System.out.println("Merging two joiner");
		StringJoiner merge = names.merge(fruits);
		System.out.println(merge);

		System.out.println(merge.toString().charAt(0));
		System.out.println(merge.length() + " " + merge.setEmptyValue("It is empty"));
	}

}
