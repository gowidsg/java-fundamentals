/*
 * It is an abstract class for writing to character streams. The methods that a subclass must implement are write(char[], int, int), flush(), and close(). 
 * Most subclasses will override some of the methods defined here to provide higher efficiency, functionality or both.
 */
package javaiostream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\write.txt";
		try {
			Writer w = new FileWriter(filename);
			w.write("My name is Shivam");
			w.append("\nAnd I am Software Engineer");
			w.close();
			System.out.println("Written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
