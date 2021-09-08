/*The super keyword in Java is a reference variable which is used to refer immediate parent class object.
 * Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
 * 
 * Usage of Java super Keyword
 * super can be used to refer immediate parent class instance variable.
 * super can be used to invoke immediate parent class method.
 * super() can be used to invoke immediate parent class constructor.
 * 
 * We can use super keyword to access the data member or field of parent class. It is used if parent class and child class have same fields.
 * 
 * The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. 
 * In other words, it is used if method is overridden.
 * 
 * The super keyword can also be used to invoke the parent class constructor
 * 
 * Note: super() is added in each class constructor automatically by compiler if there is no super() or this().
 * 
 * 
 * As we know well that default constructor is provided by compiler automatically if there is no constructor. 
 * But, it also adds super() as the first statement.
 */

package superkeyowrd;

public class Dog extends Animal {
	String type;

	Dog(){
		//super()
		type="Labrador";
		System.out.println("Dog Class Constructor");
	}
	
	void displayInfo(){
		super.displayInfo();
		System.out.println("Animal Type of Dog: "+super.type);
		System.out.println("Dog Type: "+type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.displayInfo();

	}

}

//Output
//Animal Class Constructor
//Dog Class Constructor
//Animal Type from Animal Class: Omnivores
//Animal Type of Dog: Omnivores
//Dog Type: Labrador
