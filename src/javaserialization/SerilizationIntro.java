/*
 * Serialization in Java is a mechanism of writing the state of an object into a byte-stream. 
 * It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.

The reverse operation of serialization is called deserialization where byte-stream is converted into an object. 
The serialization and deserialization process is platform-independent, it means you can serialize an object on one platform and deserialize it on a different platform.

For serializing the object, we call the writeObject() method of ObjectOutputStream class, and for deserialization we call the readObject() method of ObjectInputStream class.

We must have to implement the Serializable interface for serializing the object.

Advantages of Java Serialization
It is mainly used to travel object's state on the network (that is known as marshalling).
 */
/*
 * 
 */

package javaserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;
	/*
	 * The transient keyword can be used with the data members of a class in
	 * order to avoid their serialization. The transient modifier can be used
	 * where there are data members derived from the other data members within
	 * the same instance of the class. This transient keyword can be used with
	 * the data members which do not depict the state of the object. The data
	 * members of a non-serialized object or class can use a transient modifier.
	 */
	transient int mobileNO;

	Student(int id, String name, int mobileNO) {
		this.id = id;
		this.name = name;
		this.mobileNO = mobileNO;
	}
}

public class SerilizationIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "D:\\Technology\\java\\java-fundamentals\\Tutorial\\src\\javaserialization\\studentobject.txt";
		Student s = new Student(1, "Shivam", 999);
		try {
			FileOutputStream f = new FileOutputStream(filename);
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(s);
			o.flush();
			o.close();
			f.close();
			System.out.println("Object written to file successfully.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
