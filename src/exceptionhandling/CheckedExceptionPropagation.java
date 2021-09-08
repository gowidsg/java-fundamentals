//Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).
package exceptionhandling;

import java.io.IOException;

public class CheckedExceptionPropagation {
	void a() {

		// throw new IOException("device error"); checked exception

	}

	void b() {
		a();
	}

	void c() {
		try {
			b();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handeld");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedExceptionPropagation cep = new CheckedExceptionPropagation();
		cep.c();

	}

}
