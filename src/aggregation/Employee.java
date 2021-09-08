package aggregation;

public class Employee {
	int eid;
	String name;
	Address address;

	Employee(int eid, String name, Address address) {
		this.address = address;
		this.eid = eid;
		this.name = name;
	}
	
	void displayInfo(){

		System.out.println("ID: "+eid+" Name: "+name);
		System.out.println("City: "+address.city+"\nArea: "+address.area+"\nPin : "+address.pincode);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr1 = new Address("KNP","HI",990900);
		Employee e = new Employee(1, "Shivam", addr1);
		e.displayInfo();
	}

}
