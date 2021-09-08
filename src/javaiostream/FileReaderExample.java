/*
 * Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.

It is character-oriented class which is used for file handling in java.
 */

package javaiostream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\write.txt";
		try {
			FileReader f = new FileReader(filename);
			int data = f.read();
			while (data != -1) {
				System.out.print((char) data);
				data = f.read();
			}
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
