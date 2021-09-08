/*
 * Java FileWriter class is used to write character-oriented data to a file. 
 * It is character-oriented class which is used for file handling in java.

Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.
 */
package javaiostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\write.txt";
		try {
			FileWriter f = new FileWriter(filename);
			f.append("My name is Satyam");
			f.close();
			System.out.println("Written");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
