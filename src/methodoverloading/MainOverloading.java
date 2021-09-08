//You can have any number of main methods in a class by method overloading. 
//But JVM calls main() method which receives string array as arguments only
package methodoverloading;

public class MainOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("string[] args");
	}
	 public static void main(String args) {
		System.out.println("string args");
	}
	 
	 public static void main() {
		System.out.println("No args");
	}

}
