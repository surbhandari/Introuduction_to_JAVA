
/**
 Write a program that lets the user enter the loan amount 
 and loan period in number of years and displays the monthly 
 and total payments for each interest rate starting from 5% to 8%, 
 with an increment of 1/8. 
 <Output>
Loan Amount: 10000
Number of Years: 5
Interest Rate	Monthly Payment	Total Payment
5%			      188.71			11322.74
5.125%		      189.28			11357.13
5.25%		      189.85			11391.59
...
7.875%		      202.17			12129.97
8.0%			  202.76			12165.83
<End output>
 */

import java.util.Scanner;
public class Lab4Mainclass {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Loan Amount : ");
	double loanAmount = sc.nextDouble();
	System.out.println("Enter the Loan Period : ");
	double loanPeriod = sc.nextDouble();
	
	System.out.println("Interest Rate    Monthly Payment	 Total Payment");
	System.out.println("--------------------------------------------------------");
	for (double annualInterestRate = 5.00; annualInterestRate <= 8.00; annualInterestRate += 0.125) {

        // calculating monthly and total payment rates
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, loanPeriod * 12));

        double totalPayment = monthlyPayment * loanPeriod * 12;
        String str = "%";
        // Displaying formatted info
        System.out.printf("%-1.3f%s%17.2f%24.2f \n",annualInterestRate , str, ((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0));
        
        System.out.println("--------------------------------------------------------");
    }
	
	

	
	
}
}