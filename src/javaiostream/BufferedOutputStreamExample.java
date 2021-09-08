/*
 * Java BufferedOutputStream class is used for buffering an output stream. It internally uses buffer to store data. It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.

For adding the buffer in an OutputStream, use the BufferedOutputStream class. 
 */
package javaiostream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\fileout.txt";
		String data = "This is Buffered Output Stream";
		try {
			FileOutputStream f = new FileOutputStream(filename);
			BufferedOutputStream b = new BufferedOutputStream(f);
			b.write(data.getBytes());
			b.flush();
			b.close();
			f.close();
			System.out.println("Success....");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
