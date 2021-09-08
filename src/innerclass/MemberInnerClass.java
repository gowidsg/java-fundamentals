/*
 * A non-static class that is created inside a class but outside a method is called member inner class. 
 * It is also known as a regular inner class. It can be declared with access modifiers like public, default, private, and protected.
 * 
 * An object or instance of a member's inner class always exists within an object of its outer class. 
 * The new operator is used to create the object of member inner class with slightly different syntax.
 * 
 * The general form of syntax to create an object of the member inner class is as follows:
 * 
 * Syntax:
 * OuterClassReference.new MemberInnerClassConstructor();  
 * 
 * Example:
 * obj.new Inner();  
 */
package innerclass;

public class MemberInnerClass {
	private int data = 30;

	class Inner {
		// In this example, we are creating a msg() method in the member inner
		// class that is accessing the private data member of the outer class.
		void msg() {
			System.out.println("data is: " + data);
		}
	}

	public static void main(String[] args) {
		MemberInnerClass obj = new MemberInnerClass();
		MemberInnerClass.Inner in = obj.new Inner();
		in.msg();
	}

}
