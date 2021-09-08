package stringmethod;

public class GetBytesMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCD";

		byte[] arr = s.getBytes();
		for (byte b : arr) {
			System.out.println(b);
		}
		String news = new String(arr);
		System.out.println(news);
	}

}
