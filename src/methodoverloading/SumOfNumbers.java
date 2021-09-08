/*
 * If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
 * If we have to perform only one operation, having same name of the methods increases the readability of the program.
 * 
 * There are two ways to overload the method in java
 * By changing number of arguments
 * By changing the data type
 */

package methodoverloading;

public class SumOfNumbers {
	
	int sumOfNo(int a, int b){
		return a+b;
	}
	
	int sumOfNo(int a, int b, int c){
		return a+b+c;
	}
	public static void main(String[] args) {
		
		SumOfNumbers s = new SumOfNumbers();
		System.out.println(s.sumOfNo(1,2));
		System.out.println(s.sumOfNo(2, 4, 5));
	}

}
