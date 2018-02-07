/*Proper fractions, improper fractions, and mixed fractions are 
defined at http://www.ltcconline.net/greenl/courses/187/b/impropermixed.htm. 
Write a program that prompts the user to enter the numerator and 
denominator of a fraction number and determines 
whether it is a proper fraction and improper fraction. 
For an improper fraction number, display its mixed fraction in 
the form of a + (b / c) if b % c is not zero; 
otherwise, display only the integer. 
*/
import java.util.Scanner;
public class Lab3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int wholeNum = 0;
		// Ask for numerator and set to an integer
		System.out.println("What is the numerator?");
		int numer = input.nextInt();

		// Ask for the denominator and set to an integer
		System.out.println("What is the denominator?");
		int denom = input.nextInt();

		// Compare to see if the number is a proper fraction
		if ((numer < denom)) {
			System.out.println(numer + "/" + denom + " is a proper fraction.");
			// otherwise, get the whole number and get the remainder over the denominator
		} else if (numer >= denom) {
			// Check if the numer/denom is able to be simplified, if so ...
			if (numer % denom == 0) {
				System.out.println(numer + "/" + denom + " is an improper fraction and it can be reduced to "
						+ numer / denom + ".");
				// ... if it's not, it's an improper fraction and needs to become a mixed number.
			} else {
				wholeNum = (int) numer / (int) denom;
				System.out.println(numer + "/" + denom + " is an improper fraction and its mixed number is " 
				+ wholeNum + " + (" + numer % denom + "/" + denom + ").");
			}
		}
	}

}
