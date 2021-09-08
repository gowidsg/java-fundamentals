package methodoverloading;

public class AdditionofNo {

	static int add(int a ,int b){
		System.out.println("DATATYPE: INT");
		return a+b;
	}
	
	static double add(double a, double b){
		System.out.println("DATATYPE: DOUBLE");
		return a+b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(AdditionofNo.add(1.2, 3.2));
		System.out.println(AdditionofNo.add(6, 7));
	}

}
