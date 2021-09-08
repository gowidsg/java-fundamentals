/*
 * Java BufferedInputStream class is used to read information from stream. It internally uses buffer mechanism to make the performance fast.

The important points about BufferedInputStream are:

When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
When a BufferedInputStream is created, an internal buffer array is created.

 */
package javaiostream;

import java.io.FileInputStream;

public class BufferedInputStream {

	public static void main(String[] args) {
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\fileout.txt";
		try {
			FileInputStream f = new FileInputStream(filename);
			java.io.BufferedInputStream b = new java.io.BufferedInputStream(f);
			int i =0;
			while ((i =b.read())!=-1){
				System.out.print((char)i);
			}
			b.close();
			f.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
