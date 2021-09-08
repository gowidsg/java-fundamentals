package thiskeyword;

public class ThisAsArgumentInConstructor2 {
	
	ThisAsArgumentInConstructor obj;
	public ThisAsArgumentInConstructor2(ThisAsArgumentInConstructor obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}
	void display(){
		System.out.println(obj.name);
	}

}
