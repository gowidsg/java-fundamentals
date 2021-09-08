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

package javaserialization;

import java.io.Serializable;

public class SerilizationIntro implements Serializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
