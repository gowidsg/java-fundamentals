/*
 * The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
 * variable
 * method
 * class
 * 
 * The final keyword can be applied with the variables, 
 * a final variable that have no value it is called blank final variable or uninitialized final variable. 
 * It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only.
 * 
 * If you make any variable as final, you cannot change the value of final variable(It will be constant).
 */

package finalkeyword;

public class Bike {
	final int SPEED = 80;
	final String name;

	// if we declare static final blank variable we can initialize it with
	// static block
	static final int MILEAGE;

	static {
		MILEAGE = 20;
	}

	public Bike() {
		// speed = 90; This will give an error because we are changing the value
		// of final variable
		name = "Passion Pro"; // blank final variable can be initialiZed in
								// constructor
	}

	void displayInfo() {
		System.out.println("name: " + name + "\nspeed: " + SPEED);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = new Bike();
		b.displayInfo();

	}

}
