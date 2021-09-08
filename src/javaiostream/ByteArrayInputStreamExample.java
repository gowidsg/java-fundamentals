/*
 * The ByteArrayInputStream is composed of two words: ByteArray and InputStream. 
 * As the name suggests, it can be used to read byte array as input stream.

Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream. 
In this stream, the data is read from a byte array.

The buffer of ByteArrayInputStream automatically grows according to data.
 */
package javaiostream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte arr[] = { 35, 36, 37, 38 };
		try {
			ByteArrayInputStream b = new ByteArrayInputStream(arr);
			int k = 0;
			while ((k = b.read()) != -1) {
				System.out.printf("ASCII value is %s and Character is : %s\n", k, (char) k);
			}
			b.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
