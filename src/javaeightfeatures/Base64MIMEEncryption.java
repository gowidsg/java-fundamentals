package javaeightfeatures;

import java.util.Base64;

public class Base64MIMEEncryption {

	public static void main(String[] args) {
		Base64.Encoder encoder = Base64.getMimeEncoder();
		String str = "Hello, \nMy name is Shivam Gupta\nI am a software engineer.";
		String eStr = encoder.encodeToString(str.getBytes());
		System.out.println("Encoded MIME string: " + eStr);

		// Getting MIME decoder
		Base64.Decoder decoder = Base64.getMimeDecoder();
		// Decoding MIME encoded message
		String dStr = new String(decoder.decode(eStr));
		System.out.println("Decoded string: " + dStr);
	}

}
