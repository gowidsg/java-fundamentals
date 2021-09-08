package finalkeyword;

class Game {
	final void display() {
		System.out.println("Game");
	}
}

public class Cricket extends Game {

	void chamionshipType(final String type) {
		// type = "ICC"; you can not change the value of final parameter
		System.out.println("Championship Type: " + type);
	}
	// can't override final method
	// void display(){
	//
	// }

	public static void main(String[] args) {
		// But we can inherit and call final super class method
		Cricket c = new Cricket();
		c.display();
		c.chamionshipType("IPL");
	}

}
