package inheritance;

public class Programmer extends Employee {
	float bonus;

	public Programmer() {
		bonus = 10000f;

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p = new Programmer();
		System.out.println(p.salary+p.bonus);

	}

}
