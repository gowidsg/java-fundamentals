/*
 * Java Reader is an abstract class for reading character streams. 
 * The only methods that a subclass must implement are read(char[], int, int) and close(). Most subclasses, 
 * however, will override some of the methods to provide higher efficiency, additional functionality, or both.

Some of the implementation class are BufferedReader, CharArrayReader, FilterReader, InputStreamReader, PipedReader, StringReader
 */
package javaiostream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) {
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\write.txt";
		try {
			Reader r = new FileReader(filename);
			int data = r.read();
			while (data != -1) {
				System.out.print((char) data);
				data = r.read();
			}
			r.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
