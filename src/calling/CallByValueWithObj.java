package calling;

public class CallByValueWithObj {
	int data=100;
	void change(CallByValueWithObj obj){
		obj.data=obj.data+100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueWithObj c = new CallByValueWithObj();
		System.out.println("Before calling change: "+ c.data);
		c.change(c);
		System.out.println("After calling change: "+ c.data);
		
	}

}
