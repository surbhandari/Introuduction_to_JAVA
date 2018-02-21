/**Problem Description: Cashier Simulation

Write a program that generates a random number between 0.00 and 1000.00 exclusive, 
which represents the amount the buyer has to pay for the products. 
The program asks the buyer to enter the amount of money he/she pays and 
then displays the number of $100 bill(s), $50 bill(s), $20 bill(s), $10 bill(s), 
$5 bill(s), $2 bill(s), $1 bill(s), $.25 coin(s), $.10 coin(s), $.05 coin(s) and $.01 coin(s) 
the cashier has to return for the difference. 

Note: You need to find the optimal number of bills and coins for the change. 
Using only $1 bills and $.01 cents is not acceptable.



**/
import java.util.Scanner;
public class Cashier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = ((int)(Math.random()*100000));
		number = number/100;
		System.out.println("You need to pay   $ "+number);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of money and I will return return the difference : ");
		int cash= sc.nextInt();
		double remaining= cash-number;
		
		if (remaining > 0) {

		System.out.printf("You will get %.2f   as \n",remaining );
		if(remaining > 100) {
			
			cash=(int)remaining/100;
			remaining = remaining%100;
			System.out.println("100$ bill    : "+cash );
		}
		if(remaining > 50) {
			
			cash=(int)remaining/50;
			remaining = remaining%50;
			System.out.println("50$ bill    : "+cash );
		}
		if(remaining > 20) {
			
			cash=(int)remaining/20;
			remaining = remaining%20;
			System.out.println("20$ bill    : "+cash );
		}
		if(remaining > 10) {
			
			cash=(int)remaining/10;
			remaining = remaining%10;
			System.out.println("10$ bill    : "+cash );
		}
		if(remaining > 5) {
			cash=(int)remaining/5;
			remaining = remaining%5;
			System.out.println("5$ bill    : "+cash );
		}
		if(remaining > 2) {
			
			cash=(int)remaining/2;
			remaining = remaining%2;
			System.out.println("2$ bill    : "+cash );
		}
		if(remaining > 1) {
			
			cash=(int)remaining/1;
			remaining = remaining%1;
			System.out.println("1$ bill    : "+cash );
		}
		//rounding the remaining number in 2 place decimal 
		remaining = Math.round(remaining * 100.0) / 100.0;
		if(remaining > 0.25) {
			
			cash=(int)(remaining/0.25);
			remaining = remaining%0.25;
			System.out.println("Quarter coin     : "+cash );
		}
		if(remaining > 0.10) {
			
			cash=(int)(remaining/0.10);
			remaining = remaining%0.10;
			System.out.println("Dime coin     : "+cash );
		}
		if(remaining > 0.05) {
			
			cash=(int)(remaining/0.05);
			remaining = remaining%0.05;
			System.out.println("Nickel coin     : "+cash );
		}
		
		if(remaining > 0.01) {
			
			cash=(int)(remaining*100);
			System.out.println("cents coin     : "+cash );
		}
		
		}
		else {
			System.out.println("You still owes  $ "+ Math.abs(remaining));
		}
		
		
		
		

	}

}
