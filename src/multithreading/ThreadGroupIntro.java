/*
 * Java provides a convenient way to group multiple threads in a single object. In such way, we can suspend, resume or interrupt group of threads by a single method call.
 * A ThreadGroup represents a set of threads. A thread group can also include the other thread group. The thread group creates a tree in which every thread group except the initial thread group has a parent.

A thread is allowed to access information about its own thread group, but it cannot access the information about its thread group's parent thread group or any other thread groups.
 *
 */

package multithreading;

public class ThreadGroupIntro implements Runnable {

	public static void main(String[] args) {
		ThreadGroupIntro running = new ThreadGroupIntro();
		
		ThreadGroup tg = new ThreadGroup("Parent thread group");
		
		Thread t1 = new Thread(tg,running,"one");
		t1.start();
		Thread t2 = new Thread(tg,running,"two");
		t2.start();
		Thread t3 = new Thread(tg,running,"three");
		t3.start();
		System.out.println("Thread group name: "+tg.getName());	
	
		tg.list();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());

	}

}
