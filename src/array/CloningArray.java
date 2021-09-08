/*
 * Since, Java array implements the Cloneable interface, we can create the clone of the Java array. 
 * If we create the clone of a single-dimensional array, it creates the deep copy of the Java array. It means, it will copy the actual value. 
 * But, if we create the clone of a multidimensional array, it creates the shallow copy of the Java array which means it copies the references.
 * 
 */
package array;

public class CloningArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 9, 0, 7 };
		int cloneArr[] = arr.clone();

		for (int i : cloneArr) {
			System.out.println(i);
		}

		System.out.printf("Array equals to Clone Array : %b", arr == cloneArr);
	}

}
