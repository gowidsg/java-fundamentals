package stringproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SubstringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcometojava";
		int k = 3;

		String[] arr = new String[s.length()];
		int count = 0;
		for (int i = 0; i < s.length() - k + 1; i++) {
			arr[count] = (s.substring(i, i + k));
			count++;
		}
		String largest = arr[0];
		String smallest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && largest.compareTo(arr[i]) < 0) {
				largest = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && smallest.compareTo(arr[i]) > 0) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest + "\n" + largest);

	}

}

/*
 * package stringproblems;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import
 * java.util.Collections;
 * 
 * public class SubstringComparison {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * String s = "welcometojava"; int n = 3;
 * 
 * ArrayList<String> arr = new ArrayList<String>(); for (int i = 0; i <
 * s.length() - n+1; i++) { arr.add(s.substring(i, i + n)); }
 * Collections.sort(arr); for (String i : arr) { System.out.println(i); }
 * 
 * }
 * 
 * }
 */
