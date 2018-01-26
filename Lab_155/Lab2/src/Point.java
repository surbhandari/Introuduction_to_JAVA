

/*
(Geometry: point in a rectangle?) Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
(0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
(6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
cover all cases.) Here are two sample runs.
*/
import java.util.Scanner;

public class Point {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter a point (x, y)
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		// Check whether the point is within the rectangle
		// centered at (0, 0) with width 10 and height 5
		double distx= Math.pow(x*x, 0.5);
		double disty= Math.pow(y*y, 0.5);
		if(distx<=5)
		{
			if(disty<=2.5) {
				System.out.println("Point (" + x + ", " + y + ") is inside the rectangle");
			}
			else 
				System.out.println("Point (" + x + ", " + y + ") is outside the rectangle");
		}
		
		else 
			System.out.println("Point (" + x + ", " + y + ") is outside the rectangle");
	}
}