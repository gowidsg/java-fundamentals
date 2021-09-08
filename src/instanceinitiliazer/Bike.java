/* 
 * Instance Initializer block is used to initialize the instance data member. 
 * It run each time when object of the class is created. 
 * 
 * The initialization of the instance variable can be done directly but there can be performed extra operations 
 * while initializing the instance variable in the instance initializer block.
 * 
 * 
 * There are three places in java where you can perform operations:
 * method
 * constructor
 * block
 * 
 * 
 * 
 * it seems that instance initializer block is firstly invoked but NO. Instance intializer block is invoked at the time of object creation. 
 * The java compiler copies the instance initializer block in the constructor after the first statement super(). 
 * So firstly, constructor is invoked.
 * 
 * There are mainly three rules for the instance initializer block. They are as follows:
 * The instance initializer block is created when instance of the class is created.
 * The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).
 * The instance initializer block comes in the order in which they appear.
 */


package instanceinitiliazer;
class Vehicle{
	Vehicle(){
		System.out.println("parent class invoked");
	}
}

public class Bike extends Vehicle{
	int speed;
	
	Bike(){
		//super()
		System.out.println("child class constructor invoked");
	}
	void speedOfBike() {
		System.out.println("Speed: " + speed);
	}
	
	Bike(int a){
		//super()
		System.out.println("child class constructor: "+a);
	}

	{
		System.out.println("instance initiliazer invoked");
		speed=120;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike b = new Bike();
		Bike c= new Bike(10);
		b.speedOfBike();

	}

}
