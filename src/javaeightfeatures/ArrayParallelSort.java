/*
 * Java provides a new additional feature in Array class which is used to sort array elements parallel.New methods has added to java.util.Arrays package that use the JSR 166 Fork/Join parallelism common pool to provide sorting of arrays in parallel.The methods are called parallelSort() and are overloaded for all the primitive data types and Comparable objects.
 */

package javaeightfeatures;

import java.util.Arrays;

public class ArrayParallelSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 4, 2, 8, 5, 1, 4 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Arrays.parallelSort(arr);
		System.out.println("\nUsing arrays.parallelSort()");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		String[] str = { "N", "E", "B", "Z", "U", "A" };
		for (String s : str) {
			System.out.print(s + " ");
		}
		System.out.println("\nSorting string array with index");
		Arrays.parallelSort(str, 0, 2);
		for (String s : str) {
			System.out.print(s + " ");
		}
	}

}
