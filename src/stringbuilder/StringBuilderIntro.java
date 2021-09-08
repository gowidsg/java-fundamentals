/*
 * Java StringBuilder class is used to create mutable (modifiable) String. 
 * The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.
 */

package stringbuilder;

public class StringBuilderIntro {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());// 16
		sb.ensureCapacity(20);
		System.out.println(sb.capacity());// 34 (16*2)+2

		sb = new StringBuilder("shivam");
		System.out.println(sb);
		System.out.println(sb.capacity());// 22

		System.out.println("Lenght: " + sb.length());

		for (int i = 0; i < sb.length(); i++) {
			System.out.println(sb.charAt(i));
		}
		
		System.out.println(sb.substring(0,4));

	}

}
