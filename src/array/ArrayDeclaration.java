/*
 * Java array is an object which contains elements of a similar data type. 
 * Additionally, The elements of an array are stored in a contiguous memory location. 
 * It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
 * 
 * Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
 * Unlike C/C++, we can get the length of the array using the length member. In C/C++, we need to use the sizeof operator.
 * 
 * In Java, array is an object of a dynamically generated class. 
 * Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces. 
 * We can store primitive values or objects in an array in Java. 
 * 
 * Like C/C++, we can also create single dimentional or multidimentional arrays in Java.
 * 
 * Moreover, Java provides the feature of anonymous arrays which is not available in C/C++.
 * 
 * 
 * 
 */

package array;

public class ArrayDeclaration {

	int sumOfElements(int[] arr2) {
		int sum = 0;
		for (int i : arr2) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2 = { 1, 2, 3, 4, 5 };
		int arr3[] = { 80, 90, 93 };

		arr1 = new int[2];
		arr1[0] = 22;
		arr1[1] = 23;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		for (int i : arr3) {
			System.out.printf("Array2 element %d\n", i);
		}

		ArrayDeclaration a = new ArrayDeclaration();
		System.out.println("Sum : " + a.sumOfElements(arr2));

	}

}
