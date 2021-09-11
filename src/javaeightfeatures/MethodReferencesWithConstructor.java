package javaeightfeatures;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.println(msg);
	}
}

public class MethodReferencesWithConstructor {

	// You can refer a constructor by using the new keyword. Here, we are
	// referring constructor with the help of functional interface.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}

}
