/*Java String literal is created by using double quotes
 * 
 * Each time you create a string literal, the JVM checks the "string constant pool" first.
 * If the string already exists in the pool, a reference to the pooled instance is returned. 
 * If the string doesn't exist in the pool, a new string instance is created and placed in the pool. 
 * 
 * String objects are stored in a special memory area known as the "string constant pool".
 * 
 * By new keyword
 * String s=new String("Shivam");
 */
package string;

public class StringDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// string literal
		String s1 = "Shivam";
		String s2 = "Shivam";
		// only one object will be created. Firstly, JVM will not find any
		// string object with the value "Welcome" in string constant pool that
		// is why it will create a new object. After that it will find the
		// string with the value "Shivam" in the pool, it will not create a new
		// object but will return the reference to the same instance.
		String s3 = new String("Shivam");

		// creates two objects and one reference variable
		// In such case, JVM will create a new string object in normal
		// (non-pool) heap memory,
		// and the literal "Shivam" will be placed in the string constant pool.
		// The variable s will refer to the object in a heap (non-pool).
		System.out.println(s3);

	}

}
