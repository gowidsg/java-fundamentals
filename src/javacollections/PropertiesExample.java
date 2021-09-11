package javacollections;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("D:/Technology/java/java-fundamentals/Tutorial/src/javacollections/db.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("email"));
		System.out.println(p.getProperty("name"));
		Properties p1 = new Properties();
		p1.setProperty("name","Shivam");  
		p1.setProperty("email","sg@gmail.com");  
		  
		p1.store(new FileWriter("D:/Technology/java/java-fundamentals/Tutorial/src/javacollections/db.properties"),"Example");
	}

}
