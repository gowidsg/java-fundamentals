package multithreading;

public class RunWithoutStart extends Thread {

	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunWithoutStart t = new RunWithoutStart();

		RunWithoutStart t2 = new RunWithoutStart();
		t.run();
		t2.run();
		// As you can see in the above program that there is no
		// context-switching because here t and t2 will be treated as normal
		// object not thread object.

	}

}
