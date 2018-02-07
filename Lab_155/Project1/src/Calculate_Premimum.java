/*
South Dakota farmers are given a premium depending on the conditions at their farmyard. Imagine the
following simplified regulation: you know the size of each farmer’s farmyard in square meters and the
number of animals living at it. We won’t make a difference between different animals, although this is
far from reality. Moreover you have information about the degree the farmer uses environment-friendly
equipment and practices, expressed in a single integer greater than zero. The amount of money a
farmer receives can be calculated from these parameters as follows. First you need the space a single
animal occupies at an average. This value (in square meters) is then multiplied by the parameter that
stands for the farmer’s environment-friendliness, resulting in the premium a farmer is paid per animal
he owns. To compute the final premium of a farmer just multiply this premium per animal with the
number of animals the farmer owns.
Write a Java program to get the inputs from the keyboard and print out the output on the monitor.
Inputs
Three positive integers: the size of the farmyard in square meters, the number of animals (s)he owns
and the integer value that expresses the farmers environment-friendliness. No integer in the input is
greater than 100000 or less than 0.
Output
A single integer that holds the summed burden for South Dakota’s budget, which will always be a
whole number.


*/
import java.util.Scanner;
public class Calculate_Premimum {
	public static void main(String[] args) {

	  	//Step #1: Obtain variables for premium
	  	Scanner input = new Scanner(System.in);
	  	System.out.print("Enter size of farmyard to the nearest square meter: ");
	  	int farmSize = input.nextInt();
	  	System.out.print("Enter number of animals: ");
	  	int numAnimals = input.nextInt();
	  	System.out.print("Enter farm's degree of environmental-friendliness: ");
	  	int envFriend = input.nextInt();
	  	input.close();
	  	
	  	//Step #2: Check if 0 <= input <= 100,000
	  	if ((0 <= farmSize && farmSize <= 100000) &&
	  		(0 <= numAnimals && numAnimals <= 100000) &&
	  		(0 <= envFriend && envFriend <= 100000)) {
	  		
	  		//Step #3: Calculate farmer's premium and print result
	  		double farmSizeDouble = (double) farmSize;
	  		double calaculatedPremium = ((farmSizeDouble) / (numAnimals)) * (envFriend) * (numAnimals);
	  		int premium = (int) calaculatedPremium;
	  		System.out.println("Farmer's Total Premium: " + "$" + premium);
	  		
	  	}
	  	else {
	  		System.out.println("Please enter values that are between 0 and 100,000.");
	  	}

}
}
