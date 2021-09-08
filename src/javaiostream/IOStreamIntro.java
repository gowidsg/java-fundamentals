/*
 * Java I/O (Input and Output) is used to process the input and produce the output.
 * Java uses the concept of a stream to make I/O operation fast. 
 * The java.io package contains all the classes required for input and output operations.
 * 
 * We can perform file handling in Java by Java I/O API.
 * 
 * A stream is a sequence of data. In Java, a stream is composed of bytes. 
 * It's called a stream because it is like a stream of water that continues to flow.

In Java, 3 streams are created for us automatically. All these streams are attached with the console.

1) System.out: standard output stream

2) System.in: standard input stream

3) System.err: standard error stream
 */
package javaiostream;

import java.io.IOException;

public class IOStreamIntro {
	public static void main(String[] args) {
		int i = 0;
		try {
			i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Output Stream\n" + (char) i);
		System.err.println("Error Stream");
	}

}
