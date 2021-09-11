package exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[5];
			a[10] = 30 / 1;
			// } catch (Exception e) {
			// System.out.println(e); //unreachable code
		} catch (ArithmeticException e) {
			System.out.println(e);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
