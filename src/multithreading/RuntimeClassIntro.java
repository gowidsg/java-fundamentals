/*
 * Java Runtime class is used to interact with java runtime environment. Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc. There is only one instance of java.lang.Runtime class is available for one java application.

The Runtime.getRuntime() method returns the singleton instance of Runtime class.
 */

package multithreading;

import java.io.IOException;

public class RuntimeClassIntro {

	public static void main(String[] args) {
		try {
			// Runtime.getRuntime().exec("shutdown -r -t 0"); to restart system
			System.out.println("No of processors: "+Runtime.getRuntime().availableProcessors());
		
		System.out.println("Total memory: "+Runtime.getRuntime().totalMemory());
		System.out.println("Free memory: "+Runtime.getRuntime().freeMemory());
			for (int i=0;i<10000;i++){
				new RuntimeClassIntro();
			}
		System.out.println("After creating 10000 instance free memory: "+Runtime.getRuntime().freeMemory() );
		System.gc();
		System.out.println("After gc() free memory: "+Runtime.getRuntime().freeMemory());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
