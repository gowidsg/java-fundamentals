package stringproblems;

import java.util.Scanner;

public class Anagram2 {

	static char[] sorting(char[] charArray) {
		// System.out.println(arr);
		int temp;
		int size;
		size = charArray.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (charArray[i] > charArray[j]) {
					temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = (char) temp;
				}
			}
		}
//		System.out.println(charArray);
		return charArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next().toLowerCase();
		String b = sc.next().toLowerCase();

		if (String.valueOf(sorting(a.toCharArray())).equals(String.valueOf(sorting(b.toCharArray())))) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not");
		}
	}

}
