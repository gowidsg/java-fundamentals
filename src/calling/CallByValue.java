package calling;

public class CallByValue { 
	int data=10;
	
	void change(int data){
		data=data+10;//changes will be in the local variable only
		
	}

	public static void main(String[] args) {
		CallByValue c= new CallByValue();
		System.out.println("before calling change :"+c.data);
		// TODO Auto-generated method stub
		c.change(100);
		System.out.println("after calling change :"+c.data);
		
	}

}
