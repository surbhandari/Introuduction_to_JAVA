import java.util.Scanner;
public class Lab6Main {
public static void main(String[] args) {
	
	//Step #1: Read integer "n" from the console
	System.out.print("Enter an integer 'n': ");
	Scanner input = new Scanner(System.in);
	int n = input.nextInt();
	
	//Step #2: Display pattern
	for (int row = 1; row <= n; row++) {
		for (int col = 1; col <= n - row + 1; col++) {
			System.out.print(col + " ");
		}
		System.out.println("");
	}
	
	int decrement = 0;
	//Step #3: Display pattern #2
	System.out.println("\n");
	for (int row = 1; row <= n; row++) {
		
		for (int spaces = 0; spaces <= n - row; spaces++) {
			System.out.print("  ");
		}
		
		decrement = 0;
		for (int col = 1; col <= row; col++) {
			System.out.print(row - decrement + " ");
			decrement++;
		}
		System.out.println("");
	}
}
}


