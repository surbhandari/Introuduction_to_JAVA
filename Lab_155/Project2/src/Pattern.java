//Write a program that asks the user to enter a number “n”, which is an integer, and prints out “n” lines following the following pattern:
//
//                                            1
//                                         1  2  1
//                                      1  2  3  2  1
//                                   1  2  3  4  3  2  1
//                                1  2  3  4  5  4  3  2  1
//                             1  2  3  4  5  6  5  4  3  2  1
//                          1  2  3  4  5  6  7  6  5  4  3  2  1
//                       1  2  3  4  5  6  7  8  7  6  5  4  3  2  1
//                    1  2  3  4  5  6  7  8  9  8  7  6  5  4  3  2  1
//                 1  2  3  4  5  6  7  8  9 10  9  8  7  6  5  4  3  2  1
//              1  2  3  4  5  6  7  8  9 10 11 10  9  8  7  6  5  4  3  2  1
//           1  2  3  4  5  6  7  8  9 10 11 12 11 10  9  8  7  6  5  4  3  2  1
//        1  2  3  4  5  6  7  8  9 10 11 12 13 12 11 10  9  8  7  6  5  4  3  2  1
//     1  2  3  4  5  6  7  8  9 10 11 12 13 14 13 12 11 10  9  8  7  6  5  4  3  2  1
//  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 14 13 12 11 10  9  8  7  6  5  4  3  2  1



import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
		
		//Step 1: Prompt user to input an integer 
		System.out.println("Enter an integer: ");
		int n = input.nextInt();
		
		//Step 2: Create table
				for(int row = 1; row<=n; row++) {
					
					//Make spaces in each row that is not full (s=space)
					for(int s = n-row; s>=1; s--) {
						System.out.printf("    ");
					}
					//To make the ascending numbers in the rows
					for(int a = 1; a < row; a++) {
						System.out.printf("% 4d", a);
					}
					//To make descending numbers in the rows
					for(int d = row; d >= 1; d--) {
						System.out.printf("% 4d", d);
					
				}
					System.out.println(" ");
				}

}
}