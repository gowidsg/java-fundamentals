package statickeyword;

public class CountObject {
	static int count = 0;
	
	void countObj(){
		count++;
	}

	static void showCount() {
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountObject a = new CountObject();
		a.countObj();
		CountObject b = new CountObject();
		b.countObj();
		CountObject.showCount();
	}

}
