package superkeyowrd;

public class Animal {
	String type;

	Animal(){
		type ="Omnivores";
		System.out.println("Animal Class Constructor");
	}

	void displayInfo() {
		System.out.println("Animal Type from Animal Class: " + type);
	}

}
