package interfaceinjava;

interface Drawable {
	void draw();
}

class Rectangle implements Drawable {

	@Override
	public void draw() {
		System.out.println("Rectangle");
		// TODO Auto-generated method stub

	}

}

class Circle implements Drawable {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d;
		d = new Rectangle();
		d.draw();
		d = new Circle();
		d.draw();
	}

}
