//The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.
package thiskeyword;

public class ThisAsArgumentToMethod {

	void displayName(){
		display(this);
		System.out.println("Shivam");
	}
	
	void display(ThisAsArgumentToMethod obj){
		System.out.println("HI");
	}

	public static void main(String[] args) {
		//In event handling (or) in a situation where we have to provide reference of a class to another one. 
		//It is used to reuse one object in many methods.
		ThisAsArgumentToMethod obj = new ThisAsArgumentToMethod();
		obj.displayName();

	}

}
