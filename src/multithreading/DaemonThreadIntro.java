/*
 * Daemon thread in java is a service provider thread that provides services to the user thread. Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.

There are many java daemon threads running automatically e.g. gc, finalizer etc.

You can see all the detail by typing the jconsole in the command prompt. The jconsole tool provides information about the loaded classes, memory usage, running threads etc.
 *
 *It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
Its life depends on user threads.
It is a low priority thread.
 */

package multithreading;

public class DaemonThreadIntro extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		} else {
			System.out.println("User thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThreadIntro t1 = new DaemonThreadIntro();
		DaemonThreadIntro t2 = new DaemonThreadIntro();
		DaemonThreadIntro t3 = new DaemonThreadIntro();
		// Note: If you want to make a user thread as Daemon, it must not be
		// started otherwise it will throw IllegalThreadStateException.
		t1.setDaemon(true);

		t1.start();
		t2.start();
		t3.start();

	}

}
