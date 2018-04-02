/** Write a program that reads in a list of 5 to 20 positive integers
 *  from the users and displays the number of distinct numbers and 
 *  the distinct numbers in their input order. 
 *  Assume the input ends with 0.
 *  E.g.: For the following input: 1 3 4 2 1 3 0. 
 *  The program should produces
 *  The number of distinct positive numbers is 4
 *  The distinct positive numbers are: 1 3 4 2

*/
import java.util.Scanner;

public class Lab10Main {

	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter some positive  number and enter 0 to end the input ");
	int[] list = new int[20];
	int count =0;
	int number=0;
	do{
		number = sc.nextInt();
		if(checkDistinct(list,number)) {
			list[count]=number;
			count++;
		}
	}while(number>0);
	System.out.println("The number of distinct positive number is " + count);
    System.out.print("The distinct positive numbers are: ");
    for (int i = 0; i < count; i++) {
        System.out.print(list[i] + " ");
    }
	}
	

public static boolean checkDistinct(int[] a,int n) {
	
	for(int i =0;i<10;i++) {
		if(a[i] == n)
			return false;
		
	}	
	return true;
}
}
