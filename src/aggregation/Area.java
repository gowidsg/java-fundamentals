/*If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

Consider a situation, Employee object contains many informations such as id, name, emailId etc. 
It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc.


When use Aggregation?
Code reuse is also best achieved by aggregation when there is no is-a relationship.
Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.
*/

package aggregation;

public class Area {
	SquareOfNumber obj;
	double pi = 3.14;

	void areaOfCircle(int radius) {
		obj = new SquareOfNumber();
		int rsquare = obj.square(radius);
		System.out.println("The area of circle is :"+pi*rsquare);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area a = new Area();
		a.areaOfCircle(10);

	}

}
