package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowCheckedException {

	public static void readFile() throws FileNotFoundException {
		FileReader file = new FileReader("C:\\User\\Shivam.txt");
		BufferedReader fileinput = new BufferedReader(file);
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("code");
	}

}
