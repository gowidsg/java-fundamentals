package thiskeyword;

public class ThisToReferCurrentVariable {
	int i;
	
	ThisToReferCurrentVariable(int i){
		this.i=i;
	}
	
	void display(){
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisToReferCurrentVariable obj = new ThisToReferCurrentVariable(10);
		obj.display();

	}

}
