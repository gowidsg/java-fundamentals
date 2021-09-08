package javaiostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fin;
		try {
			fin = new FileInputStream(
					"D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\fileout.txt");

			System.out.println("Bytes available:" + fin.available());
			// int s = fin.read();
			// System.out.println("Character: " + (char) s);
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
