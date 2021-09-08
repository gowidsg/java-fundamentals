//We can pass the this keyword in the constructor also. It is useful if we have to use one object in multiple classes
package thiskeyword;

public class ThisAsArgumentInConstructor {
	String name="Shivam";
	

	public ThisAsArgumentInConstructor() {
		// TODO Auto-generated constructor stub
		ThisAsArgumentInConstructor2 obj = new ThisAsArgumentInConstructor2(this);
		obj.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisAsArgumentInConstructor ob = new ThisAsArgumentInConstructor();

	}

}
