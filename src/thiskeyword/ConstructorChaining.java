//The this() constructor call should be used to reuse the constructor from the constructor. 
//It maintains the chain between the constructors i.e. it is used for constructor chaining.
package thiskeyword;

public class ConstructorChaining {
	int rollNo;
	String name;
	float fees;
	ConstructorChaining(int rollNo, String name, float fees) {
		// TODO Auto-generated constructor stub
		this(rollNo,name);
		this.fees=fees;
		
	}
	
	ConstructorChaining(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	void display(){
		System.out.println(rollNo+" "+name+" "+fees);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining obj = new ConstructorChaining(1, "Shivam", 10000f);
		obj.display();

	}

}
