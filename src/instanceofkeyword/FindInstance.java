/*
 * The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
 * 
 * The instanceof in java is also known as type comparison operator because it compares the instance with type. It returns either true or false. 
 * If we apply the instanceof operator with any variable that has null value, it returns false.
 * 
 */
package instanceofkeyword;

class Instance {

}

public class FindInstance extends Instance {
	String s = "HI";

	public FindInstance() {

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h = "Shiv";
		FindInstance fi = new FindInstance();
		System.out.printf("s is instance of String Object : %b \n", fi.s instanceof String);
		System.out.printf("fi reference variable is instance of FindStance: %b  \n", fi instanceof FindInstance);
		System.out.printf("fi reference variable is instance of Instance: %b  \n", fi instanceof Instance);

		System.out.println("Finding the object type of variable: " + h.getClass().getSimpleName());

	}

}
