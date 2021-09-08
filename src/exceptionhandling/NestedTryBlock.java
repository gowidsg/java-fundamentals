package exceptionhandling;

public class NestedTryBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int a = 40 / 0;
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println(e);
			}
			int a = 30 / 2;
			int arr[] = new int[1];
			arr[2] = a;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
