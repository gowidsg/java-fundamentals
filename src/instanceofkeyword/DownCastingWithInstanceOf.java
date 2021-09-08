/*
 * When Subclass type refers to the object of Parent class, it is known as downcasting. 
 * If we perform it directly, compiler gives Compilation error. If you perform it by typecasting, ClassCastException is thrown at runtime. 
 * But if we use instanceof operator, downcasting is possible.
 * 
 * 
 */

package instanceofkeyword;


interface Printable {

}

class A implements Printable {
	public void a() {
		System.out.println("Method a");
	}
}

class B implements Printable {
	public void b() {
		System.out.println("method b");
	}

}

class Call {
	void invoke(Printable p) {// upcasting
		if (p instanceof A) {
			A a = new A();// downcasting
			a.a();
		}
		if (p instanceof B) {
			B obj = new B();// downcasting
			obj.b();
		}
	}
}

public class DownCastingWithInstanceOf {

	public DownCastingWithInstanceOf() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p = new B();
		Call c = new Call();
		c.invoke(p);

		Printable pr = new A();
		Call cr = new Call();
		cr.invoke(pr);

	}

}
