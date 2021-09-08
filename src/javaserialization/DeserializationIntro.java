/*
 * Deserialization is the process of reconstructing the object from the serialized state. 
 * It is the reverse operation of serialization. Let's see an example where we are reading the data from a deserialized object.

Deserialization is the process of reconstructing the object from the serialized state. 
It is the reverse operation of serialization. Let's see an example where we are reading the data from a deserialized object.
 */

package javaserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationIntro {

	public static void main(String[] args) {
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaserialization\\studentobject.txt";

		try {
			FileInputStream f = new FileInputStream(filename);
			ObjectInputStream o = new ObjectInputStream(f);
			Student s = (Student) o.readObject();
			System.out.println(s.id + " " + s.name + " " + s.mobileNO);
			/*
			 * mobileNO is transient data member it can't be seriliazed
			 */
			o.close();
			f.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
