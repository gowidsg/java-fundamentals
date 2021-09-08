package stringbuffer;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Shivam");

		sb.append(" Gupta");
		System.out.println(sb);

		sb.insert(0, "Hi ");
		System.out.println(sb);

		sb.replace(0, 2, "Bye");
		System.out.println(sb);

		sb.delete(0, 4);
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		// The capacity() method of the StringBuffer class returns the current
		// capacity of the buffer. The default capacity of the buffer is 16. If
		// the number of character increases from its current capacity, it
		// increases the capacity by (oldcapacity*2)+2. For example if your
		// current capacity is 16, it will be (16*2)+2=34.
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.append("Satyam");
		System.out.println(sb2.capacity());
		sb2.append(" Gupta is my name");

		System.out.println(sb2.capacity());

		// The ensureCapacity() method of the StringBuffer class ensures that
		// the given capacity is the minimum to the current capacity. If it is
		// greater than the current capacity, it increases the capacity by
		// (oldcapacity*2)+2. For example if your current capacity is 16, it
		// will be (16*2)+2=34.

		sb2.ensureCapacity(20);
		System.out.println(sb2.capacity());

		sb2.ensureCapacity(50);
		System.out.println(sb2.capacity());

	}

}
