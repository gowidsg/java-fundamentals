/*
 * Java ByteArrayOutputStream class is used to write common data into multiple files. 
 * In this stream, the data is written into a byte array which can be written to multiple streams later.

The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.

The buffer of ByteArrayOutputStream automatically grows according to data.
 */
package javaiostream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) {
		String filename1 = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\fileout1.txt";
		String filename2 = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\fileout2.txt";
		try {
			FileOutputStream f = new FileOutputStream(filename1);
			FileOutputStream f2 = new FileOutputStream(filename2);
			ByteArrayOutputStream b = new ByteArrayOutputStream();
			String s = "Writing to multiple files.";
			b.write(s.getBytes());
			System.out.println("Size of byte array stream: "+b.size());
			b.writeTo(f);
			b.writeTo(f2);
			b.flush();
			b.close();
			f.close();
			System.out.println("Success.. written to two files");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
