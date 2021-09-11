package multithreading;

public class ThreadInfoMethods extends Thread {

	public  void run(){
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args) {
		ThreadInfoMethods t1 = new ThreadInfoMethods();
		ThreadInfoMethods t2  = new ThreadInfoMethods();
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t1.setName("Shivam");
		t2.setName("Gupta");
		
		t1.start();
		t2.start();
		

	}

}
