package stringproblems;

import java.util.Arrays;

public class TokenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String news = " ";
		// String news = " He is a very very good boy, isn't he? also @ with _
		// ";
		// and . ";
		String s = news.trim();
		// System.out.println(news);

		// String []arr = news.split("[\\W]+|\\s")
		String[] arr = s.split("[\\s|,|@|'|\\?|\\.|_]+");

		// System.out.println(Arrays.toString(arr))
		if (arr.length == 0) {
			System.out.println(s.length());
		} else {
			for (String i : arr) {
				System.out.println(i);
			}
		}
	}

}
