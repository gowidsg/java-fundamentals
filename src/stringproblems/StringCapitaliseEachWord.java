package stringproblems;

import java.util.Scanner;

public class StringCapitaliseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] s = str.split(" ");

		StringBuilder capS = new StringBuilder();

		for (String i : s) {
			capS.append(i.substring(0, 1).toUpperCase() + i.substring(1, i.length()) + " ");
		}

		System.out.println(capS.toString().trim());

	}

}
