/*
 * Java anonymous inner class is an inner class without a name and for which only a single object is created. 
 * An anonymous inner class can be useful when making an instance of an object with certain "extras" 
 * such as overloading methods of a class or interface, without having to actually subclass a class.
 * 
 * In simple words, a class that has no name is known as an anonymous inner class in Java. 
 * It should be used if you have to override a method of class or interface. 
 * 
 * Java Anonymous inner class can be created in two ways:
 * Class (may be abstract or concrete).
 * Interface
 */
package innerclass;

interface Eatable {
	void eat();
}

abstract class Person {
	abstract void eat();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person() {

			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Class implemetation through class");
			}
		};
		p.eat();
		
		Eatable e= new Eatable() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Anonymous Class implemetation through interface");
			}
		};
		e.eat();
	}

}
