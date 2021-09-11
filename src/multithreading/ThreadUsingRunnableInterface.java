package multithreading;

public class ThreadUsingRunnableInterface implements Runnable {

	public static void main(String[] args) {
		ThreadUsingRunnableInterface m = new ThreadUsingRunnableInterface();
		Thread t = new Thread(m);
		t.start();
	}
	// If you are not extending the Thread class,your class object would not be
	// treated as a thread object.So you need to explicitely create Thread class
	// object.We are passing the object of your class that implements Runnable
	// so that your class run() method may execute.

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("using runnable interface");
	}

}
