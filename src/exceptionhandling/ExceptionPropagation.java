/*
 * An exception is first thrown from the top of the stack and if it is not caught, 
 * it drops down the call stack to the previous method. 
 * If not caught there, the exception again drops down to the previous method, 
 * and so on until they are caught or until they reach the very bottom of the call stack. This is called exception propagation.
 * 
 * Note: By default Unchecked Exceptions are forwarded in calling chain (propagated).
 * 
 * Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).
 */
package exceptionhandling;

public class ExceptionPropagation {
	public void a() {
		int ab = 30 / 0;
	}

	void b() {
		a();
	}

	void c() {
		try {
			b();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.c();
	}

}
