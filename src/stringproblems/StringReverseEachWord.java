package stringproblems;

import java.util.Scanner;

public class StringReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split("\\s");

		StringBuilder sb;
		StringBuilder finalstr = new StringBuilder();
		for (String i : s) {
			sb = new StringBuilder(i);
			sb.reverse();
			finalstr.append(sb+" ");
		}
		System.out.println(finalstr.toString().trim());
	}

}
