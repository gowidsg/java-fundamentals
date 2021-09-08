/*
 * There are many immutable classes like String, Boolean, Byte, Short, Integer, Long, Float, Double etc.
 * In short, all the wrapper classes and String class is immutable.
 * We can also create immutable class by creating final class that have final data members as the example given below:
 * 
 * Example to create Immutable class
 * In this example, we have created a final class. It have one final data member, a parameterized constructor and getter method.
 * 
 * 
 * The class is immutable because:
 *
 *The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
 *The class is final so we cannot create the subclass.
 *There is no setter methods i.e. we have no option to change the value of the instance variable.
 */
package miscellaneous;

public final class ImmutableClass {
	final int id;

	public ImmutableClass(int id) {
		this.id = id;
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass i = new ImmutableClass(123);
		System.out.println(i.getId());

	}

}
