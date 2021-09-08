package javaiostream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaiostream\\fileout.txt");
			fout.write(65);
			String s = "\nMy name is Shivam Gupta";
			byte []b = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success...");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
