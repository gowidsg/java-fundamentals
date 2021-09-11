package javaeightfeatures;

import java.util.Base64;

public class Base64URLEncryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64.Encoder encoder = Base64.getUrlEncoder();

		String str = encoder.encodeToString("http://www.google.com".getBytes());
		System.out.println("Encoded URL: "+str);
		
		Base64.Decoder decoder = Base64.getUrlDecoder();
		
		System.out.println("Decode URL: "+new String(decoder.decode(str)));
	}

}
