/*
 * 
 * The java command-line argument is an argument i.e. passed at the time of running the java program.

The arguments passed from the console can be received in the java program and it can be used as an input.

So, it provides a convenient way to check the behavior of the program for the different values. 
You can pass N (1,2,3 and so on) numbers of arguments from the command prompt.

compile by > javac CLI.java  
run by > java CLI hi  
 */

package miscellaneous;

public class CLI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("your arguments are");
		for(String i:args){
			System.out.print("\n"+i);
		}
		
	}

}
