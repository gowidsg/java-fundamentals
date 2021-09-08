/*Dog d=new Animal();//Compilation error  
 * If we perform downcasting by typecasting, ClassCastException is thrown at runtime.
 * 
 * Dog d=(Dog)new Animal();  
 * Compiles successfully but ClassCastException is thrown at runtime  
 * 
 * 
 */

package instanceofkeyword;

class Animal {
	void display() {
		System.out.println("Animal");
	}

}

class Dog extends Animal {
	static void display(Animal obj) {
		if (obj instanceof Dog) {
			Dog n = (Dog) obj; // downcasting
			System.out.println("Animal Type: Dog");
		}

	}

}

public class DowncastingIssue {

	public static void main(String[] args) {
		// Dog d = new Animal(); //Compilation Error for typecasting
		// Dog d= (Dog) new Animal(); //Class Cast Exception at runtime
		Animal a = new Dog();
		Dog.display(a);

	}

}
