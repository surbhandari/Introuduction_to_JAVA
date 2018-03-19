/**

Problem Description: Assume that the letters A, E, I, O and U are vowels. Write a program that prompts the user to enter a string, and display the number of vowels and consonants in the string 
*/
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
//Step 1: prompt user for string input
		System.out.println("Enter a string of capital letters: " );
	
		String string = input.nextLine();
		string= string.toUpperCase();
		
//Step 2: determine how many consonants and vowels there are
		int vowels = 0;
		int consonants = 0;
			for(int i=0; i<string.length(); i++) {
				char a = string.charAt(i);
				
				if(Character.isLetter(a)) {
					if((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')) {
						vowels++;
					}
					else {
						consonants++;
					}
				}
				
						
		}
//Step 3: output the number of each type of letter
			System.out.println("There are " + vowels + "   vowels and " + consonants + "    consonants");
				}
	}

	

