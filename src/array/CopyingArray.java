//We can copy an array to another by the arraycopy() method of System class
package array;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };

		char[] arr2 = new char[arr.length];
		System.arraycopy(arr, 1, arr2, 0, 3);

		System.out.println(String.valueOf(arr2));

		char[] duplicateArr = new char[arr.length];

		System.arraycopy(arr, 0, duplicateArr, 0, arr.length);
		
		System.out.println(String.valueOf(duplicateArr));
	}

}
