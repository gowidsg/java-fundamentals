package array;

public class AnonymousArray {

	static int[] printArray(int arr[]) {// parameter
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Getting arr element as parameter: " + arr[i]);
			arr1[i] = arr[i] + 10;
		}
		return arr1; // returning array from method
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = AnonymousArray.printArray(new int[] { 1, 2, 3 });// anonymous
																		// array
																		// as
																		// argument
		for (int i : arr) {
			System.out.println("Returned array element after adding 10 to each value: " + i);
		}
	}

}
