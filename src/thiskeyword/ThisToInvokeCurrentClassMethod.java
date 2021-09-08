package thiskeyword;

//this keyword should be the first line
public class ThisToInvokeCurrentClassMethod {
	
	public ThisToInvokeCurrentClassMethod() {
		// TODO Auto-generated constructor stub
		
	}
	void displayName(){
		display(); //this.display()
		System.out.println("Shivam");
	}
	void display(){
		System.out.println("HI");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisToInvokeCurrentClassMethod obj = new ThisToInvokeCurrentClassMethod();
		obj.displayName();
	}

}
