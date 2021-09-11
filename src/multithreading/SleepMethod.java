/*
 * The sleep() method of Thread class is used to sleep a thread for the specified amount of time.

Syntax of sleep() method in java
The Thread class provides two methods for sleeping a thread:

public static void sleep(long miliseconds)throws InterruptedException
public static void sleep(long miliseconds, int nanos)throws InterruptedException
 */

package multithreading;

public class SleepMethod extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepMethod t = new SleepMethod();
		SleepMethod t2 = new SleepMethod();
		t.start();
		t2.start();
		// As you know well that at a time only one thread is executed. If you
		// sleep a thread for the specified time,the thread shedular picks up
		// another thread and so on.
		
		
		// t2.start(); We can't start thread twice
		
	}

}
