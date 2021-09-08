//Java Runtime Polymorphism with Multilevel Inheritance

package runtimepolymorphism;

class Animal {
	void speak() {
		System.out.println("Animal Speak");
	}

	void eat() {
		System.out.println("Flesh and fruits");
	}
}

class Lion extends Animal {
	void speak() {
		System.out.println("Lion Roar");
	}

	void eat() {
		System.out.println("flesh");
	}
}

public class Cub extends Lion {

	public Cub() {
		// TODO Auto-generated constructor stub
	}

	void speak() {
		System.out.println("Cub Cooing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1, a2, a3;
		a1 = new Animal();
		a2 = new Lion();
		a3 = new Cub();

		a1.speak();
		a2.speak();
		a3.speak();

		a3.eat(); // since cub doesn't override eat method so parent
					// class (Lion) eat method will invoked
	}

}
