/*
 * Multithreading in Java is a process of executing multiple threads simultaneously.

A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.

However, we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.
 *
 *Advantages of Java Multithreading
1) It doesn't block the user because threads are independent and you can perform multiple operations at the same time.

2) You can perform many operations together, so it saves time.

3) Threads are independent, so it doesn't affect other threads if an exception occurs in a single thread.
 *
 *Java provides Thread class to achieve thread programming. Thread class provides constructors and methods to create and perform operations on a thread. Thread class extends Object class and implements Runnable interface.
 *
 *
 *There are two ways to create a thread:

By extending Thread class
By implementing Runnable interface.
*/

package multithreading;

public class ThreadUsingThreadClass extends Thread {

	public void run(){
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		
		ThreadUsingThreadClass t = new ThreadUsingThreadClass();
		t.start();

	}

}
