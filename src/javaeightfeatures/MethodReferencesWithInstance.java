package javaeightfeatures;

interface Speakable2 {
	void speak();
}

public class MethodReferencesWithInstance {
	public void saySomething() {
		System.out.println("this is non static method calling with method refernces");
	}

	public static void main(String[] args) {
		MethodReferencesWithInstance m = new MethodReferencesWithInstance();
		
		Speakable2 s =m::saySomething;
		s.speak();
		
		
		Thread t = new Thread(new MethodReferencesWithInstance()::saySomething);
		t.start();
	}

}
