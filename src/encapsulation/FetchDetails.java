
package encapsulation;

public class FetchDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails ad = new AccountDetails();
		ad.setAccNo(101);
		ad.setAccHolder("Shivam");

		System.out.println("Acc No: " + ad.getAccNo() + "\nAcc Holder: " + ad.getAccHolder());

	}

}
