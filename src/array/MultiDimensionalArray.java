package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// Multi dimensional Array declaration

		int arr1[][];
		int[][] arr2;
		// int [][]arr3;
		int[] arr4[];

		arr1 = new int[2][2];
		arr1[0][0] = 30;
		arr1[0][1] = 32;
		arr1[1][0] = 33;
		arr1[1][1] = 34;

		int[][] arr5 = { { 1, 2, 6 }, { 3, 4, 8 } };// shorthand

		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}
		// In Java, an array is an object. For array object, a proxy class is
		// created whose name can be obtained by getClass().getName() method on
		// the object.
		System.out.println(arr1.getClass().getName());

	}

}
