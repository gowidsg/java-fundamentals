//Since Java 8, we can have static method in interface. 
package interfaceinjava;

interface Removable {
	static String remove() {
		return "Interface having static method";
	}
}

public class StaticMethod implements Removable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Removable.remove());

	}

}
