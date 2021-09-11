/*
 * Java provides a class Base64 to deal with encryption. 
 * You can encrypt and decrypt your data by using provided methods. You need to import java.util.Base64 in your source file to use its methods.
 * 
 * This class provides three different encoders and decoders to encrypt information at each level. 
 * Basic Encoding and Decoding
It uses the Base64 alphabet specified by Java in RFC 4648 and RFC 2045 for encoding and decoding operations. The encoder does not add any line separator character. The decoder rejects data that contains characters outside the base64 alphabet.

URL and Filename Encoding and Decoding
It uses the Base64 alphabet specified by Java in RFC 4648 for encoding and decoding operations. The encoder does not add any line separator character. The decoder rejects data that contains characters outside the base64 alphabet./

*MIME
It uses the Base64 alphabet as specified in RFC 2045 for encoding and decoding operations. The encoded output must be represented in lines of no more than 76 characters each and uses a carriage return '\r' followed immediately by a linefeed '\n' as the line separator. No line separator is added to the end of the encoded output. All line separators or other characters not found in the base64 alphabet table are ignored in decoding operation.
*
*/

package javaeightfeatures;

import java.util.Base64;

public class Base64Encryption {

	public static void main(String[] args) {

		Base64.Encoder encoder = Base64.getEncoder();

		byte arr[] = { 1, 2 };

		byte arr2[] = encoder.encode(arr);

		System.out.println("Encode byte array: " + arr2);

		byte arr3[] = new byte[5]; //// Make sure it has enough size to store
									//// copied bytes

		int x = encoder.encode(arr, arr3);
		System.out.println("Encoded byte array written to another: " + arr3);
		System.out.println("No. of bytes written: " + x);

		
		String str = encoder.encodeToString("Shivam Gupta".getBytes());
		System.out.println("Encoded string: "+str);
		
		Base64.Decoder decoder= Base64.getDecoder();
		System.out.println(new String(decoder.decode(str)));
		
	}

}
