/*
 * The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.
 * 
 * The static can be:
 * Variable (also known as a class variable)
 * Method (also known as a class method)
 * Block
 * Nested class
 * 
 * 
 * If you declare any variable as static, it is known as a static variable.
 * The static variable can be used to refer to the common property of all objects (which is not unique for each object)
 * The static variable gets memory only once in the class area at the time of class loading.
 * 
 * 
 * If you apply static keyword with any method, it is known as static method.
 * A static method belongs to the class rather than the object of a class.
 * A static method can be invoked without the need for creating an instance of a class.
 * A static method can access static data member and can change the value of it.
 * 
 * There are two main restrictions for the static method. They are:
 * The static method can not use non static data member or call non-static method directly.
 * this and super cannot be used in static context.
 * 
 *  Java static block
 *  Is used to initialize the static data member.
 *  It is executed before the main method at the time of classloading.
 */

package statickeyword;

public class Student {

	int id;
	String name;
	static String college = "IEC";

	static{
		System.out.println("Welcome to College");
	}
	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	static void changeCollege(){
		college = "GBT";
	}
	void displayInfo() {
		System.out.println("id: " + id + "\nname: " + name + "\ncollege: " + college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.changeCollege();
		Student s = new Student(1, "Shivam");
		s.displayInfo();
		Student s2 = new Student(2, "Satyam");
		s2.displayInfo();
		

	}

}
