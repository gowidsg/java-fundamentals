/*
 * A class i.e., created inside a method, is called local inner class in java. 
 * Local Inner Classes are the inner classes that are defined inside a block. 
 * Generally, this block is a method body. Sometimes this block can be a for loop, or an if clause. 
 * Local Inner classes are not a member of any enclosing classes. 
 * They belong to the block they are defined within, due to which local inner classes cannot have any access modifiers associated with them. 
 * However, they can be marked as final or abstract. These classes have access to the fields of the class enclosing it.
 * 
 * If you want to invoke the methods of the local inner class, you must instantiate this class inside the method.
 * 
 * Rule: Local variables can't be private, public, or protected.
 * 
 * Rules for Java Local Inner class
1) Local inner class cannot be invoked from outside the method.
2) Local inner class cannot access non-final local variable till JDK 1.7. 
Since JDK 1.8, it is possible to access the non-final local variable in the local inner class.
 */
package innerclass;

public class LocalInnerClass {
	private int data = 30;

	void display() {
		// private int localvar=50; can't be private protected, public
		int localvar = 50;
		class Local {
			void msg() {
				System.out.println(data + localvar);
			}

		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass lic = new LocalInnerClass();
		lic.display();
	}

}
